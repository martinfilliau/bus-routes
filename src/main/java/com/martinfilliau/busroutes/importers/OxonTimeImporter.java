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
    
    public void run(JSONObject root) {
        JSONArray routes = (JSONArray) root.get("routes");
        JSONArray stops = (JSONArray) root.get("stops");
        doRoutes(routes);
        doStopsOnRoutes(stops);
    }
    
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

    private void doStopsOnRoutes(JSONArray s) {
        JSONArray stops;
        JSONObject route;
        String slug;
        JSONObject stop;
        Node n;
        String id;
        Long previousId;
        Route currentRoute;
        StopOnRoute stopOnRoute;
        Stop st;
        String stopCode;
        Node stopNode;
        Transaction tx = service.beginTx();
        try {
            for (Object o : s) {
                route = (JSONObject) o;
                slug = (String) route.get("route");
                currentRoute = routesAvailable.get(slug);
                stops = (JSONArray) route.get("stops");
                previousId = null;
                for (Object obj : stops) {
                    stop = (JSONObject) obj;
                    stopCode = (String) stop.get("code");
                    stopNode = graph.getOrCreateStop(stopCode);
                    st = new Stop(stopNode);
                    st.setNodeProperties((String) stop.get("name"), graph.getStopsIndex());
                    
                    id = StopOnRoute.buildUniqueId(slug, st.getCode());
                    n = graph.getOrCreateStopOnRoute(id);
                    stopOnRoute = new StopOnRoute(n);
                    stopOnRoute.setNodeProperties(st, currentRoute, graph.getStopsOnRouteIndex());
                    if(previousId != null) {
                        graph.addRouteRelation(previousId.toString(), Long.toString(n.getId()));
                    }
                    previousId = n.getId();
                    
                    stopNode.createRelationshipTo(n, RelTypes.STOP);
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
