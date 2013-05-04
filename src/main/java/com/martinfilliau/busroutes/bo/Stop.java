package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author martinfilliau
 */
public class Stop {

    public final static String STOP_CODE = "stopCode";
    public final static String STOP_NAME = "stopName";
    
    private String name;
    
    private String code;
    
    private List<Route> routes;

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

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
