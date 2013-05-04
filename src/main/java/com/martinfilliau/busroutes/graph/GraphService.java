package com.martinfilliau.busroutes.graph;

import com.martinfilliau.busroutes.bo.RelTypes;
import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.bo.StopOnRoute;
import java.util.Iterator;
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
    private Index<Node> nodeIndex;
    private ExecutionEngine engine;

    public GraphService(GraphDatabaseService service) {
        this.service = service;
        this.nodeIndex = this.service.index().forNodes("stops", MapUtil.stringMap(IndexManager.PROVIDER, "lucene", "type", "fulltext"));
        this.engine = new ExecutionEngine(service);
    }

    /**
     * Get a stop by its code
     * @param code
     * @return Node or null if not found
     */
    public Node getStop(String uid) {
        return this.nodeIndex.get(StopOnRoute.UUID, uid).getSingle();
    }
    
    
    public Node createNode() {
        return this.service.createNode();
    }
    
    public Index<Node> getIndex() {
        return this.nodeIndex;
    }
    
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
    public Iterator<Node> getStopsByCode(String code) {
        return this.nodeIndex.get(Stop.STOP_CODE, code).iterator();
    }
    
    /**
     * Full text search stops by name
     * @param name to search
     * @return Iterator<Node>
     */
    public Iterator<Node> searchStopsByName(String name) {
        return this.nodeIndex.query(Stop.STOP_NAME, name).iterator();
    }
    
    /**
     * Get routes (shortest path) between two nodes
     * @param start node
     * @param end node
     * @return Iterable<Path>
     */
    public Iterable<Path> getRoutes(Node start, Node end) {
        PathFinder<Path> finder = GraphAlgoFactory.shortestPath(Traversal.expanderForAllTypes(Direction.OUTGOING), 100);
        return finder.findAllPaths(start, end);
    }
}
