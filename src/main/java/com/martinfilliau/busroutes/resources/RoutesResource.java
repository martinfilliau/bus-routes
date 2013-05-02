package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.Stop;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;

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
        this.nodeIndex = service.index().forNodes("stops");
    }
    
    @GET
    public List<Stop> getAllStops() {
        List<Stop> stops = new ArrayList<Stop>();
        return stops;
    }
    
    @GET
    @Path("search")
    public Stop getStop(@QueryParam("code") String code) {
        Stop s = new Stop();
        Node n = this.nodeIndex.get("code", code).getSingle();
        if (n != null) {
            s.setName((String)n.getProperty("name"));
        }
        return s;
    }
    
}
