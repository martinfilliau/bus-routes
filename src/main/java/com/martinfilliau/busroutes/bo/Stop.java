package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.index.Index;

/**
 *
 * @author martinfilliau
 */
public class Stop {

    public final static String STOP_CODE = "stopCode";
    public final static String STOP_NAME = "stopName";
    
    private String name;
    
    private String code;
    
    private Node node;
    
    public Stop() {
        
    }
    
    public Stop(Node n) {
        node = n;
    }
    
    public void setNodeProperties(String name, Index<Node> index) {
        this.node.setProperty(STOP_NAME, name);
        index.add(node, STOP_NAME, name);
    }

    @JsonIgnore
    public Node getNode() {
        return node;
    }
    
    @JsonProperty
    public String getName() {
        return (String) this.node.getProperty(Stop.STOP_NAME);
    }

    @JsonProperty
    public String getCode() {
        return (String) this.node.getProperty(Stop.STOP_CODE);
    }

    @JsonProperty
    public List<StopOnRoute> getStopsOnRoute() {
        if(this.node != null) {
            List<StopOnRoute> routes = new ArrayList<StopOnRoute>();
            Relationship rel;
            Iterator<Relationship> it = this.node.getRelationships(RelTypes.STOP).iterator();
            while(it.hasNext()) {
                rel = it.next();
                routes.add(new StopOnRoute(rel.getEndNode()));
            }
            return routes;            
        } else {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return this.getName() + " (" + this.getCode() + ")";
    }
}
