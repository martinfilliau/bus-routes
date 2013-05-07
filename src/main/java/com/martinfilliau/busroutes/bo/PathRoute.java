package com.martinfilliau.busroutes.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author martinfilliau
 */
public class PathRoute {
 
    private List<StopOnRoute> steps;
    
    private String start;
    
    private String end;
    
    public PathRoute(Path path) {
        steps = new ArrayList<StopOnRoute>();
        start = (String) path.startNode().getProperty(Stop.STOP_NAME);
        end = (String) path.endNode().getProperty(Stop.STOP_NAME);
        Stop s;
        StopOnRoute sr;
        for(Relationship rel : path.relationships()) {
            if(isStopOnRoute(rel.getStartNode())) {
                steps.add(new StopOnRoute(rel.getStartNode()));
            }
        }
    }
    
    @JsonProperty
    public String getStart() {
        return start;
    }
    
    @JsonProperty
    public String getEnd() {
        return end;
    }
    
    @JsonProperty
    public List<StopOnRoute> getSteps() {
        return steps;
    }
    
    @JsonIgnore
    private boolean isStopOnRoute(Node n) {
        return n.hasProperty(StopOnRoute.UUID);
    }
}
