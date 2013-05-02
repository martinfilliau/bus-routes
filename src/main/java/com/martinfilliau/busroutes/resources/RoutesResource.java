package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.Stop;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.neo4j.graphdb.GraphDatabaseService;

/**
 *
 * @author martinfilliau
 */
@Path("/routes")
public class RoutesResource {
    
    private final GraphDatabaseService service;
    
    public RoutesResource(GraphDatabaseService service) {
        this.service = service;
    }
    
    @GET
    public List<Stop> getAllStops() {
        List<Stop> stops = new ArrayList<Stop>();
        return stops;
    }
    
}
