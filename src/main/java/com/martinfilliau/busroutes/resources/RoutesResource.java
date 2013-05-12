package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.PathRoute;
import com.martinfilliau.busroutes.graph.GraphService;
import com.martinfilliau.busroutes.graph.RoutePathPrinter;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.kernel.Traversal;

/**
 *
 * @author martinfilliau
 */
@Path("/route")
public class RoutesResource {

    private final GraphService graph;

    public RoutesResource(GraphDatabaseService service) {
        this.graph = new GraphService(service);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("search")
    public List<PathRoute> searchRoutes(@QueryParam("start") String start, @QueryParam("end") String end) {
        Iterable<org.neo4j.graphdb.Path> paths = this.getPaths(start, end);
        List<PathRoute> routes = new ArrayList<PathRoute>();
        for (org.neo4j.graphdb.Path p : paths) {
            routes.add(new PathRoute(p));
        }
        return routes;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("explain")
    public String explainRoutes(@QueryParam("start") String start, @QueryParam("end") String end) {
        Iterable<org.neo4j.graphdb.Path> paths = this.getPaths(start, end);
        RoutePathPrinter printer = new RoutePathPrinter();
        StringBuilder sb = new StringBuilder();
        for (org.neo4j.graphdb.Path p : paths) {
            sb.append(Traversal.pathToString(p, printer)).append("\n");
        }
        return sb.toString();
    }
    
    private Iterable<org.neo4j.graphdb.Path> getPaths(String start, String end) throws WebApplicationException {
        Node s = this.graph.getStop(start);
        Node e = this.graph.getStop(end);
        if (s == null || e == null) {
            throw new WebApplicationException(400);
        }
        return this.graph.getRoutes(s, e);
    }
}
