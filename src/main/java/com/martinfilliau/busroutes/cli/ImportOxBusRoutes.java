package com.martinfilliau.busroutes.cli;

import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.config.MainConfig;
import com.martinfilliau.busroutes.graph.GraphService;
import com.yammer.dropwizard.cli.ConfiguredCommand;
import com.yammer.dropwizard.config.Bootstrap;
import java.io.FileReader;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(ImportOxBusRoutes.class);

    private static GraphDatabaseService service;
    private GraphService graph;
    
    public ImportOxBusRoutes() {
        super("import", "Import Ox Bus Routes from JSON file");
    }

    @Override
    protected void run(Bootstrap<MainConfig> bootstrap, Namespace namespace, MainConfig configuration) throws Exception {
        service = new GraphDatabaseFactory().newEmbeddedDatabase(configuration.getNeoPath());
        graph = new GraphService(service);
        registerShutdownHook();
        JSONParser parser = new JSONParser();
        JSONObject root = (JSONObject) parser.parse(new FileReader(configuration.getImportOx()));
        JSONArray routes = (JSONArray) root.get("routes");
        JSONArray stops = (JSONArray) root.get("stops");
        doRoutes(routes);
        doStops(stops);
    }

    private void doRoutes(JSONArray routes) {
        JSONObject route;
        String name;
        String route_id;
        String operator;
        String slug;
        for (Object o : routes) {
            route = (JSONObject) o;
            name = (String) route.get("name");
            route_id = (String) route.get("id");
            operator = (String) route.get("operator");
            slug = (String) route.get("slug");
            LOGGER.info("Found route " + slug);
        }
    }

    private void doStops(JSONArray s) {
        JSONArray stops;
        JSONObject route;
        String slug;
        String code;
        String name;
        JSONObject stop;
        Node n;
        String query;
        Long previousId;
        Transaction tx = service.beginTx();
        try {
            for (Object o : s) {
                route = (JSONObject) o;
                slug = (String) route.get("route");
                stops = (JSONArray) route.get("stops");
                previousId = null;
                for (Object obj : stops) {
                    stop = (JSONObject) obj;
                    code = (String) stop.get(Stop.CODE);
                    name = (String) stop.get(Stop.NAME);
                    n = graph.getOrCreateStop(code, name);
                    if(previousId != null) {
                        graph.addRouteRelation(previousId.toString(), Long.toString(n.getId()),
                                slug.replace("-", "").replace(":", ""));
                    }
                    previousId = n.getId();
                }
            }
            tx.success();
        } catch (Exception e) {
            LOGGER.error("Error in importing stops", e);
        } finally {
            tx.finish();
        }
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
