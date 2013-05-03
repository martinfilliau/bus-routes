package com.martinfilliau.busroutes.health;

import com.yammer.metrics.core.HealthCheck;
import org.neo4j.graphdb.GraphDatabaseService;

/**
 *
 * @author martinfilliau
 */
public class NeoHealth extends HealthCheck {

    private GraphDatabaseService service;
    
    public NeoHealth(GraphDatabaseService service) {
        super("NeoHealth");
        this.service = service;
    }
    
    @Override
    protected Result check() throws Exception {
        // try to get a node
        this.service.getNodeById(1);
        // query the index for stops
        // TODO "stops" shouldn't be hard-coded
        this.service.index().existsForNodes("stops");
        return Result.healthy();
    }
    
}
