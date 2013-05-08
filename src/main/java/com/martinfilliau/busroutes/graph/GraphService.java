package com.martinfilliau.busroutes.graph;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.bo.StopOnRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.graphalgo.GraphAlgoFactory;
import org.neo4j.graphalgo.PathFinder;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.helpers.collection.MapUtil;
import org.neo4j.kernel.Traversal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author martinfilliau
 */
public class GraphService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GraphService.class);

    private GraphDatabaseService service;
    private Index<Node> stopsOnRouteIndex;
    private Index<Node> stopsIndex;
    private ExecutionEngine engine;

    public GraphService(GraphDatabaseService service) {
        this.service = service;
        this.stopsOnRouteIndex = this.service.index().forNodes("stopsonroute",
                MapUtil.stringMap(IndexManager.PROVIDER, "lucene", "type", "fulltext"));
        this.stopsIndex = this.service.index().forNodes("stops",
                MapUtil.stringMap(IndexManager.PROVIDER, "lucene", "type", "fulltext"));
        this.engine = new ExecutionEngine(service);
    }

    public Node getOrCreateStopOnRoute(String uid) {
        Node n = this.getStopOnRoute(uid);
        if (n == null) {
            n = this.createNode();
            n.setProperty(StopOnRoute.UUID, uid);
            this.stopsOnRouteIndex.add(n, StopOnRoute.UUID, uid);
        }
        return n;
    }
    
    public Node getOrCreateStop(String code) {
        Node n = this.getStop(code);
        if (n == null) {
            n = this.createNode();
            n.setProperty(Stop.STOP_CODE, code);
            this.stopsIndex.add(n, Stop.STOP_CODE, code);
        }
        return n;
    }
    
    /**
     * Get a stop on route by its unique ID
     * @param uid unique identifier of the stop on route
     * @return Node or null if not found
     */
    public Node getStopOnRoute(String uid) {
        return this.stopsOnRouteIndex.get(StopOnRoute.UUID, uid).getSingle();
    }
    
    /**
     * Get a stop by its code
     * @param code unique identifier of the stop
     * @return Node or null if not found
     */
    public Node getStop(String code) {
        return this.stopsIndex.get(Stop.STOP_CODE, code).getSingle();
    }
    
    public Node createNode() {
        return this.service.createNode();
    }
    
    public Index<Node> getStopsOnRouteIndex() {
        return this.stopsOnRouteIndex;
    }
    
    public Index<Node> getStopsIndex() {
        return this.stopsIndex;
    }
    
    /**
     * Add a relation between two stops on route
     * @param nodeStart UID of the start node
     * @param nodeEnd UID of the end node
     */
    public void addRouteRelation(String nodeStart, String nodeEnd) {
        StringBuilder sb = new StringBuilder();
        sb.append("START a=node(")
                .append(nodeStart)
                .append("), b=node(")
                .append(nodeEnd)
                .append(") CREATE UNIQUE a-[r:")
                .append(RelTypes.ROUTE.name())
                .append("]->b");
        LOGGER.info("Query: " + sb.toString());
        this.engine.execute(sb.toString());
    }
    
    /**
     * Get all stops matching a given code
     * @param code to search
     * @return Iterator<Node>
     */
    public List<Stop> getStopsByCode(String code) {
        return nodesToStops(this.stopsOnRouteIndex.get(Stop.STOP_CODE, code).iterator());
    }
    
    /**
     * Full text search stops by name
     * @param name to search
     * @return Iterator<Node>
     */
    public List<Stop> searchStopsByName(String name) {
        return nodesToStops(this.stopsOnRouteIndex.query(Stop.STOP_NAME, name).iterator());
    }
    
    /**
     * Get a list of Stop from an Iterator<Node>
     * @param nodes Iterator<Node>
     * @return list of stops
     */
    public List<Stop> nodesToStops(Iterator<Node> nodes) {
        List<Stop> stops = new ArrayList<Stop>();
        while(nodes.hasNext()) {
            stops.add(new Stop(nodes.next()));
        }
        return stops;
    }
    
    /**
     * Get routes (shortest path) between two nodes
     * @param start node
     * @param end node
     * @return Iterable<Path>
     */
    public Iterable<Path> getRoutes(Node start, Node end) {
        PathFinder<Path> finder = GraphAlgoFactory.shortestPath(Traversal.expanderForAllTypes(Direction.BOTH), 100);
        return finder.findAllPaths(start, end);
    }
}
