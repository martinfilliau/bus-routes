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
        String uniqueId = route.getSlug() + "/" + stop.getCode();
        this.node.setProperty(Stop.STOP_CODE, stop.getCode());
        this.node.setProperty(Stop.STOP_NAME, stop.getName());
        this.node.setProperty(Route.ROUTE_NAME, route.getName());
        this.node.setProperty(Route.ROUTE_ID, route.getId());
        this.node.setProperty(Route.ROUTE_SLUG, route.getSlug());
        this.node.setProperty(Route.ROUTE_OPERATOR, route.getOperator());
        this.node.setProperty(StopOnRoute.UUID, uniqueId);
        index.add(this.node, Stop.STOP_CODE, stop.getCode());
        index.add(this.node, Stop.STOP_NAME, stop.getName());
        index.add(this.node, Route.ROUTE_ID, route.getId());
        index.add(this.node, Route.ROUTE_NAME, route.getName());
        index.add(this.node, Route.ROUTE_OPERATOR, route.getOperator());
        index.add(this.node, Route.ROUTE_SLUG, route.getSlug());
        index.add(this.node, StopOnRoute.UUID, uniqueId);
    }
    
    @JsonIgnore
    public Node getUnderlyingNode() {
        return this.node;
    }

    @JsonProperty
    public String getStopCode() {
        return (String) node.getProperty(Stop.STOP_CODE);
    }

    @JsonProperty
    public String getStopName() {
        return (String) node.getProperty(Stop.STOP_NAME);
    }

    @JsonProperty
    public String getRouteName() {
        return (String) node.getProperty(Route.ROUTE_NAME);
    }

    @JsonProperty
    public String getRouteSlug() {
        return (String) node.getProperty(Route.ROUTE_ID);
    }

    @JsonProperty
    public String getRouteOperator() {
        return (String) node.getProperty(Route.ROUTE_OPERATOR);
    }
}
