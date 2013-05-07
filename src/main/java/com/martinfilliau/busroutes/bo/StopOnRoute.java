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

    public final static String UUID = "uniqueId";

    private Node node;

    public StopOnRoute() {
    }
    
    public StopOnRoute(Node n) {
        this.node = n;
    }
    
    public void setNodeProperties(Stop stop, Route route, Index<Node> index) {
        this.node.setProperty(Stop.STOP_CODE, stop.getCode());
        this.node.setProperty(Stop.STOP_NAME, stop.getName());
        this.node.setProperty(Route.ROUTE_NAME, route.getName());
        this.node.setProperty(Route.ROUTE_ID, route.getId());
        this.node.setProperty(Route.ROUTE_SLUG, route.getSlug());
        this.node.setProperty(Route.ROUTE_OPERATOR, route.getOperator());
        index.add(this.node, Stop.STOP_CODE, stop.getCode());
        index.add(this.node, Stop.STOP_NAME, stop.getName());
        index.add(this.node, Route.ROUTE_ID, route.getId());
        index.add(this.node, Route.ROUTE_NAME, route.getName());
        index.add(this.node, Route.ROUTE_OPERATOR, route.getOperator());
        index.add(this.node, Route.ROUTE_SLUG, route.getSlug());
    }
    
    /**
     * Build unique ID for this stop on route
     * @param routeSlug unique identifier of the route
     * @param stopCode unique identifier of the stop
     * @return String
     */
    @JsonIgnore
    public static String buildUniqueId(String routeSlug, String stopCode) {
        return routeSlug + "/" + stopCode;
    }
    
    @JsonIgnore
    public Node getNode() {
        return this.node;
    }
    
    @JsonProperty
    public Stop getStop() {
        Stop s = new Stop();
        s.setName((String) this.node.getProperty(Stop.STOP_NAME));
        s.setCode((String) this.node.getProperty(Stop.STOP_CODE));
        return s;
    }
    
    @JsonProperty
    public Route getRoute() {
        Route r = new Route();
        r.setId((String) this.node.getProperty(Route.ROUTE_ID));
        r.setName((String) this.node.getProperty(Route.ROUTE_NAME));
        r.setOperator((String) this.node.getProperty(Route.ROUTE_OPERATOR));
        r.setSlug((String) this.node.getProperty(Route.ROUTE_SLUG));
        return r;
    }
    
    @JsonProperty
    public String getUniqueId() {
        return (String) this.node.getProperty(StopOnRoute.UUID);
    }
}
