package com.martinfilliau.busroutes.importers;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Route;
import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.bo.StopOnRoute;
import com.martinfilliau.busroutes.graph.GraphService;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author martinfilliau
 */
public class OxonTimeImporter {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(OxonTimeImporter.class);
    
    private static GraphDatabaseService service;
    private GraphService graph;
    
    private HashMap<String, Route> routesAvailable = new HashMap<String, Route>();

    public OxonTimeImporter(GraphDatabaseService gds) {
        service = gds;
        graph = new GraphService(gds);
    }
    
    /**
     * Run the importer with the given JSON object
     * @param root JSON object to import
     */
    public void run(JSONObject root) {
        JSONArray routes = (JSONArray) root.get("routes");
        JSONArray stops = (JSONArray) root.get("stops");
        doRoutes(routes);
        doStopsOnRoutes(stops);
    }
    
    /**
     * Handles the bus routes
     * @param routes list of JSON objects
     */
    private void doRoutes(JSONArray routes) {
        JSONObject route;
        Route r;
        String slug;
        for (Object o : routes) {
            route = (JSONObject) o;
            slug = (String) route.get("slug");
            r = new Route();
            r.setName((String) route.get("name"));
            r.setId((String) route.get("id"));
            r.setOperator((String) route.get("operator"));
            r.setSlug(slug);
            routesAvailable.put(slug, r);
            LOGGER.info("Found route " + slug);
        }
    }

    /**
     * Handles the stops on routes
     * @param s list of routes
     */
    private void doStopsOnRoutes(JSONArray routes) {
        JSONArray jsonStops;
        JSONObject jsonRoute;
        String routeSlug;
        JSONObject jsonStop;
        Node nodeOnRoute;
        String onRouteId;
        Long previousNodeId;
        Route currentRoute;
        StopOnRoute stopOnRoute;
        Stop stop;
        Node nodeStop;
        Transaction tx = service.beginTx();
        try {
            // for each route
            for (Object route : routes) {
                jsonRoute = (JSONObject) route;
                routeSlug = (String) jsonRoute.get("route");
                currentRoute = routesAvailable.get(routeSlug);
                jsonStops = (JSONArray) jsonRoute.get("stops");
                previousNodeId = null;
                // for each stop in one route
                for (Object obj : jsonStops) {
                    jsonStop = (JSONObject) obj;
                    nodeStop = graph.getOrCreateStop((String) jsonStop.get("code"));
                    stop = new Stop(nodeStop);
                    stop.setNodeProperties((String) jsonStop.get("name"), graph.getStopsIndex());
                    
                    onRouteId = StopOnRoute.buildUniqueId(routeSlug, stop.getCode());
                    nodeOnRoute = graph.getOrCreateStopOnRoute(onRouteId);
                    stopOnRoute = new StopOnRoute(nodeOnRoute);
                    stopOnRoute.setNodeProperties(stop, currentRoute, graph.getStopsOnRouteIndex());
                    if(previousNodeId != null) {
                        graph.addRouteRelation(previousNodeId, nodeOnRoute.getId());
                    }
                    previousNodeId = nodeOnRoute.getId();
                    
                    graph.addStopToOnRouteRelation(nodeStop.getId(), nodeOnRoute.getId());
                }
            }
            tx.success();
        } catch (Exception e) {
            LOGGER.error("Error in importing stops on routes", e);
        } finally {
            tx.finish();
        }
    }
}
