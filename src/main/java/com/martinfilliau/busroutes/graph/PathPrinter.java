package com.martinfilliau.busroutes.graph;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.kernel.Traversal;
import org.neo4j.graphdb.Path;

/**
 *
 * @author martinfilliau
 */
public class PathPrinter implements Traversal.PathDescriptor<Path> {

    private final String nodePropertyKey;

    public PathPrinter(String nodePropertyKey) {
        this.nodePropertyKey = nodePropertyKey;
    }

    @Override
    public String nodeRepresentation(org.neo4j.graphdb.Path path, Node node) {
        return "(" + node.getProperty(nodePropertyKey, "") + ")";
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