package com.martinfilliau.busroutes.graph;

import com.martinfilliau.busroutes.bo.Stop;
import java.util.Iterator;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.helpers.collection.MapUtil;

/**
 *
 * @author martinfilliau
 */
public class GraphService {

    private GraphDatabaseService service;
    private Index<Node> nodeIndex;

    public GraphService(GraphDatabaseService service) {
        this.service = service;
        this.nodeIndex = this.service.index().forNodes("stops", MapUtil.stringMap(IndexManager.PROVIDER, "lucene", "type", "fulltext"));

    }

    public Node getStop(String code) {
        return this.nodeIndex.get(Stop.CODE, code).getSingle();
    }
    
    public Node getOrCreateStop(String code, String name) {
        Node n = this.getStop(code);
        if (n == null) {
            n = this.service.createNode();
            n.setProperty(Stop.CODE, code);
            n.setProperty(Stop.NAME, name);
            nodeIndex.add(n, Stop.CODE, code);
            nodeIndex.add(n, Stop.NAME, name);
        }
        return n;
    }
    
    public Iterator<Node> getStopsByCode(String code) {
        return this.nodeIndex.get(Stop.CODE, code).iterator();
    }
    
    public Iterator<Node> searchStopsByName(String name) {
        return this.nodeIndex.query(Stop.NAME, name).iterator();
    }
}
