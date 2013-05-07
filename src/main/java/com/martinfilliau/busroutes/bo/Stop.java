package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.graphdb.Node;
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
    
    public void setNodeProperties(Stop stop, Index<Node> index) {
        this.node.setProperty(STOP_NAME, stop.getName());
        index.add(node, STOP_NAME, name);
    }

    @JsonIgnore
    public Node getNode() {
        return node;
    }
    
    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.code + ")";
    }
}
