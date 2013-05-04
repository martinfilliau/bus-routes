package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.graphdb.Node;

/**
 *
 * @author martinfilliau
 */
public class Stop {
   
    public final static String CODE = "code";
    public final static String NAME = "name";
    
    public Stop() {
        
    }
    
    public Stop(Node n) {
        this.name = (String) n.getProperty(Stop.NAME);
        this.code = (String) n.getProperty(Stop.CODE);
    }
    
    @JsonProperty
    private String code;
    
    @JsonProperty
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
