package com.martinfilliau.busroutes.resources;

import com.martinfilliau.busroutes.bo.Stop;
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
import javax.ws.rs.core.Response;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.helpers.collection.MapUtil;

/**
 *
 * @author martinfilliau
 */
@Path("/bus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BusResource {
 
    
    private final GraphDatabaseService service;
    private final Index<Node> nodeIndex;

    public BusResource(GraphDatabaseService service) {
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
}
