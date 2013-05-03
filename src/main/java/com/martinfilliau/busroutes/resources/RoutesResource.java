package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Stop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import org.neo4j.graphalgo.GraphAlgoFactory;
import org.neo4j.graphalgo.PathFinder;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.helpers.collection.MapUtil;
import org.neo4j.kernel.Traversal;

/**
 *
 * @author martinfilliau
 */
@Path("/routes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoutesResource {

    private final GraphDatabaseService service;
    private final Index<Node> nodeIndex;

    public RoutesResource(GraphDatabaseService service) {
        this.service = service;
        this.nodeIndex = service.index().forNodes("stops", MapUtil.stringMap(IndexManager.PROVIDER, "lucene", "type", "fulltext"));
    }

    @GET
    @Path("search")
    public List<Stop> searchStops(@QueryParam("code") String code, @QueryParam("name") String name) {
        List<Stop> stops = new ArrayList<Stop>();
        Iterator<Node> i;
        if (code != null) {
            i = this.nodeIndex.get(Stop.CODE, code).iterator();
        } else if (name != null) {
            i = this.nodeIndex.query(Stop.NAME, name).iterator();
        } else {
            throw new WebApplicationException(400);
        }
        Node n;
        Stop s;
        while (i.hasNext()) {
            n = i.next();
            s = new Stop();
            if (n.hasProperty(Stop.NAME)) {
                s.setName((String) n.getProperty(Stop.NAME));
            }
            s.setCode((String) n.getProperty(Stop.CODE));
            stops.add(s);
        }
        return stops;
    }

    @GET
    @Path("routes")
    public String searchRoutes(@QueryParam("start") String start, @QueryParam("end") String end) {
        Node s = this.nodeIndex.get(Stop.CODE, start).getSingle();
        Node e = this.nodeIndex.get(Stop.CODE, end).getSingle();
        PathFinder<org.neo4j.graphdb.Path> finder = GraphAlgoFactory.shortestPath(Traversal.expanderForTypes(RelTypes.ROUTE, Direction.OUTGOING), 100);
        Iterable<org.neo4j.graphdb.Path> paths = finder.findAllPaths(s, e);
        PathPrinter printer = new PathPrinter("name");
        StringBuilder sb = new StringBuilder();
        for (org.neo4j.graphdb.Path p : paths) {
            sb.append(Traversal.pathToString(p, printer)).append("\n");
        }
        return sb.toString();
    }

    static class PathPrinter implements Traversal.PathDescriptor<org.neo4j.graphdb.Path> {

        private final String nodePropertyKey;

        public PathPrinter(String nodePropertyKey) {
            this.nodePropertyKey = nodePropertyKey;
        }
    
        @Override
        public String nodeRepresentation(org.neo4j.graphdb.Path path, Node node) {
            return "(" + node.getProperty(nodePropertyKey, "") + ")";
        }

        @Override
        public String relationshipRepresentation(org.neo4j.graphdb.Path path, Node from, Relationship relationship) {
            String prefix = "--";
            String suffix = "--";
            if (from.equals(relationship.getEndNode())) {
                prefix = "<--";
            } else {
                suffix = "-->";
            }
            return prefix + "[" + relationship.getType().name() + "]" + suffix;
        }
    }
}
