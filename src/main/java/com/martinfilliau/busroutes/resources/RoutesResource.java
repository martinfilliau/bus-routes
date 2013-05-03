package com.martinfilliau.busroutes.resources;

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
    @Path("search")
    public List<Stop> searchStops(@QueryParam("code") String code, @QueryParam("name") String name) {
        List<Stop> stops = new ArrayList<Stop>();
        Iterator<Node> i;
        if(code != null) {
            i = this.nodeIndex.get("code", code).iterator();
        } else if(name != null) {
            i = this.nodeIndex.get("name", name).iterator();
        } else {
            throw new WebApplicationException(400);
        }
        Node n;
        Stop s;
        while(i.hasNext()) {
            n = i.next();
            s = new Stop();
            if(n.hasProperty("name")) {
                s.setName((String)n.getProperty("name"));
            }
            s.setCode((String)n.getProperty("code"));
            stops.add(s);
        }
        return stops;
    }
    
}
