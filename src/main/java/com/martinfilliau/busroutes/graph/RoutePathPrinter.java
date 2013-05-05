package com.martinfilliau.busroutes.graph;

import com.martinfilliau.busroutes.bo.Stop;
import com.martinfilliau.busroutes.bo.StopOnRoute;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.kernel.Traversal;
import org.neo4j.graphdb.Path;

/**
 *
 * @author martinfilliau
 */
public class RoutePathPrinter implements Traversal.PathDescriptor<Path> {

    @Override
    public String nodeRepresentation(org.neo4j.graphdb.Path path, Node node) {
        return "(" + node.getProperty(Stop.STOP_NAME) + " " + node.getProperty(StopOnRoute.UUID) + ")";
    }

    @Override
    public String relationshipRepresentation(org.neo4j.graphdb.Path path, Node from, Relationship relationship) {
        String prefix = "--";
        String suffix = "--";
        if (from.equals(relationship.getEndNode())) {
            prefix = "<--";
        } else {
            suffix = "-->";
        }
        return prefix + "[" + relationship.getType().name() + "]" + suffix;
    }
}