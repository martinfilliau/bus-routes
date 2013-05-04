package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;

/**
 *
 * @author martinfilliau
 */
public class StopOnRoute {

    public final static String STOP_CODE = "stopCode";
    public final static String STOP_NAME = "stopName";
    public final static String ROUTE_NAME = "routeName";
    public final static String ROUTE_ID = "routeId";
    public final static String ROUTE_SLUG = "routeSlug";
    public final static String ROUTE_OPERATOR = "routeOperator";
    private Node node;

    public StopOnRoute() {
    }
    
    public StopOnRoute(Node n) {
        this.node = n;
    }
    
    public void setNodeProperties(String code, String name, Route route, Index<Node> index) {
        this.node.setProperty(StopOnRoute.STOP_CODE, code);
        this.node.setProperty(StopOnRoute.STOP_NAME, name);
        this.node.setProperty(StopOnRoute.ROUTE_NAME, route.getName());
        this.node.setProperty(StopOnRoute.ROUTE_ID, route.getId());
        this.node.setProperty(StopOnRoute.ROUTE_SLUG, route.getSlug());
        this.node.setProperty(StopOnRoute.ROUTE_OPERATOR, route.getOperator());
        index.add(this.node, StopOnRoute.STOP_CODE, code);
        index.add(this.node, StopOnRoute.STOP_NAME, name);
        index.add(this.node, StopOnRoute.ROUTE_ID, route.getId());
        index.add(this.node, StopOnRoute.ROUTE_NAME, route.getName());
        index.add(this.node, StopOnRoute.ROUTE_OPERATOR, route.getOperator());
        index.add(this.node, StopOnRoute.ROUTE_SLUG, route.getSlug());
    }
    
    @JsonIgnore
    public Node getUnderlyingNode() {
        return this.node;
    }

    @JsonProperty
    public String getStopCode() {
        return (String) node.getProperty(StopOnRoute.STOP_CODE);
    }

    @JsonProperty
    public String getStopName() {
        return (String) node.getProperty(StopOnRoute.STOP_NAME);
    }

    @JsonProperty
    public String getRouteName() {
        return (String) node.getProperty(StopOnRoute.ROUTE_NAME);
    }

    @JsonProperty
    public String getRouteSlug() {
        return (String) node.getProperty(StopOnRoute.ROUTE_ID);
    }

    @JsonProperty
    public String getRouteOperator() {
        return (String) node.getProperty(StopOnRoute.ROUTE_OPERATOR);
    }
}
