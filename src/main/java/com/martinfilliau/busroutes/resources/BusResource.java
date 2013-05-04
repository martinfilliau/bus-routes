package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.StopOnRoute;
import com.martinfilliau.busroutes.graph.GraphService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;

/**
 *
 * @author martinfilliau
 */
@Path("/bus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BusResource {
 
    private final GraphService graph;

    public BusResource(GraphDatabaseService service) {
        this.graph = new GraphService(service);
    }
    
    @GET
    @Path("search")
    public List<StopOnRoute> searchStops(@QueryParam("code") String code, @QueryParam("name") String name) {
        List<StopOnRoute> stops = new ArrayList<StopOnRoute>();
        Iterator<Node> i;
        if (code != null) {
            i = this.graph.getStopsByCode(code);
        } else if (name != null) {
            i = this.graph.searchStopsByName(name);
        } else {
            throw new WebApplicationException(400);
        }
        Node n;
        while (i.hasNext()) {
            n = i.next();
            stops.add(new StopOnRoute(n));
        }
        return stops;
    }
}
