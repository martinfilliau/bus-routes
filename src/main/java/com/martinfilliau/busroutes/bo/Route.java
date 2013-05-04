package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author martinfilliau
 */
public class Route {
    
    public final static String ROUTE_NAME = "routeName";
    public final static String ROUTE_ID = "routeId";
    public final static String ROUTE_SLUG = "routeSlug";
    public final static String ROUTE_OPERATOR = "routeOperator";
    
    @JsonProperty
    private String name;
    
    @JsonProperty
    private String operator;
    
    @JsonProperty
    private String slug;

    @JsonProperty
    private String id;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
