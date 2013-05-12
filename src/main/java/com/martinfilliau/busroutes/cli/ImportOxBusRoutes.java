package com.martinfilliau.busroutes.cli;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Route;
import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.bo.StopOnRoute;
import com.martinfilliau.busroutes.config.MainConfig;
import com.martinfilliau.busroutes.graph.GraphService;
import com.martinfilliau.busroutes.importers.OxonTimeImporter;
import com.yammer.dropwizard.cli.ConfiguredCommand;
import com.yammer.dropwizard.config.Bootstrap;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;
import net.sourceforge.argparse4j.inf.Namespace;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author martinfilliau
 */
public class ImportOxBusRoutes extends ConfiguredCommand<MainConfig> {

    private static GraphDatabaseService service;
    
    public ImportOxBusRoutes() {
        super("import", "Import Ox Bus Routes from JSON file");
    }

    @Override
    protected void run(Bootstrap<MainConfig> bootstrap, Namespace namespace, MainConfig configuration) throws Exception {
        service = new GraphDatabaseFactory().newEmbeddedDatabase(configuration.getNeoPath());
        OxonTimeImporter oti = new OxonTimeImporter(service);
        registerShutdownHook();
        JSONParser parser = new JSONParser();
        JSONObject root = (JSONObject) parser.parse(new FileReader(configuration.getImportOx()));
        oti.run(root);
    }

    private static void shutdown()
    {
        service.shutdown();
    }

    private static void registerShutdownHook()
    {
        // Registers a shutdown hook for the Neo4j and index service instances
        // so that it shuts down nicely when the VM exits (even if you
        // "Ctrl-C" the running example before it's completed)
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                shutdown();
            }
        });
    }

}
