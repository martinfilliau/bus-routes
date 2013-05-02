package com.martinfilliau.busroutes.services;

import com.yammer.dropwizard.lifecycle.Managed;
import org.neo4j.graphdb.GraphDatabaseService;

/**
 *
 * @author martinfilliau
 */
public class NeoService implements Managed {

    private final GraphDatabaseService service;
    
    public NeoService(GraphDatabaseService service) {
        this.service = service;
    }
    
    public void start() throws Exception {
    }

    public void stop() throws Exception {
        this.service.shutdown();
    }
    
}
