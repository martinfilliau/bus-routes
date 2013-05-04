package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.graph.GraphService;
import com.martinfilliau.busroutes.graph.PathPrinter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import org.neo4j.graphalgo.GraphAlgoFactory;
import org.neo4j.graphalgo.PathFinder;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.helpers.collection.MapUtil;
import org.neo4j.kernel.Traversal;

/**
 *
 * @author martinfilliau
 */
@Path("/route")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoutesResource {

    private final GraphService graph;

    public RoutesResource(GraphDatabaseService service) {
        this.graph = new GraphService(service);
    }

    @GET
    @Path("search")
    public String searchRoutes(@QueryParam("start") String start, @QueryParam("end") String end) {
        Node s = this.graph.getStop(start);
        Node e = this.graph.getStop(end);
        PathFinder<org.neo4j.graphdb.Path> finder = GraphAlgoFactory.shortestPath(Traversal.expanderForTypes(RelTypes.ROUTE, Direction.OUTGOING), 100);
        Iterable<org.neo4j.graphdb.Path> paths = finder.findAllPaths(s, e);
        PathPrinter printer = new PathPrinter("name");
        StringBuilder sb = new StringBuilder();
        for (org.neo4j.graphdb.Path p : paths) {
            sb.append(Traversal.pathToString(p, printer)).append("\n");
        }
        return sb.toString();
    }
}
