package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.graph.GraphService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import org.neo4j.graphdb.GraphDatabaseService;

/**
 *
 * @author martinfilliau
 */
@Path("/stop")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StopResource {
 
    private final GraphService graph;

    public StopResource(GraphDatabaseService service) {
        this.graph = new GraphService(service);
    }
    
    @GET
    @Path("search")
    public List<Stop> searchStops(@QueryParam("code") String code, @QueryParam("name") String name) {
        List<Stop> stops = new ArrayList<Stop>();
        if (code != null) {
            stops = this.graph.getStopsByCode(code);
        } else if (name != null) {
            stops = this.graph.searchStopsByName(name);
        } else {
            throw new WebApplicationException(400);
        }
        return stops;
    }
}
