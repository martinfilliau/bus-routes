package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.graph.GraphService;
import com.martinfilliau.busroutes.graph.RoutePathPrinter;
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
        Node s = this.graph.getStopOnRoute(start);
        Node e = this.graph.getStopOnRoute(end);
        if (s == null || e == null) {
            throw new WebApplicationException(400);
        }
        Iterable<org.neo4j.graphdb.Path> paths = this.graph.getRoutes(s, e);
        RoutePathPrinter printer = new RoutePathPrinter();
        StringBuilder sb = new StringBuilder();
        for (org.neo4j.graphdb.Path p : paths) {
            sb.append(Traversal.pathToString(p, printer)).append("\n");
        }
        return sb.toString();
    }
}
