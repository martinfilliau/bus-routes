package com.martinfilliau.busroutes;

import com.martinfilliau.busroutes.cli.ImportOxBusRoutes;
import com.martinfilliau.busroutes.config.MainConfig;
import com.martinfilliau.busroutes.resources.RoutesResource;
import com.martinfilliau.busroutes.services.NeoService;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;


public class RoutesService extends Service<MainConfig> {

    @Override
    public void initialize(Bootstrap<MainConfig> btstrp) {
        btstrp.setName("RoutesService");
        btstrp.addCommand(new ImportOxBusRoutes());
    }

    @Override
    public void run(MainConfig t, Environment e) throws Exception {
        final GraphDatabaseService service = new GraphDatabaseFactory()
                .newEmbeddedDatabase(t.getNeoPath());
        
        e.manage(new NeoService(service));
        e.addResource(new RoutesResource(service));
    }

    public static void main(String[] args) throws Exception {
        new RoutesService().run(args);
    }
}