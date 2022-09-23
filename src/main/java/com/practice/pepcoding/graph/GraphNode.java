package com.practice.pepcoding.graph;


import com.google.common.collect.Sets;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphNode {

    private Map<Integer, Set<Node>> graph;

    public GraphNode(GraphRouteBuilder that) {
        this.graph = that.graph;
    }

    public Map<Integer, Set<Node>> getGraph() {
        return graph;
    }

    public static GraphRouteBuilder builder() {
        return new GraphRouteBuilder();
    }

    public static class GraphRouteBuilder {

        private Map<Integer, Set<Node>> graph;
        boolean biDirectional = true;

        public GraphRouteBuilder() {
            this.graph = new LinkedHashMap<>();
        }

        public GraphRouteBuilder add(Integer src, Integer dest) {
             add(src, dest, 0);
             return this;
        }

        public GraphRouteBuilder add(Integer src, Integer dest, Integer weight) {
            createEdge(src, dest, weight);
            if (biDirectional) createEdge(dest, src, weight);
            return this;
        }

        private void createEdge(Integer src, Integer dest, Integer weight) {
            if (Objects.isNull(this.graph.get(src))) {
                this.graph.put(src, Sets.newHashSet(new Node(dest, weight)));
            }
            Set<Node> destWList = this.graph.get(src);
            destWList.add(new Node(dest, weight));
        }

        public GraphNode build() {
            return new GraphNode(this);

        }
    }

    public static class Node{
        Integer destination;
        Integer weight;

        public Node(Integer destination) {
            this.destination = destination;
            this.weight=0;
        }

        public Node(Integer destination, Integer weight) {
            this.destination = destination;
            this.weight = weight;
        }

        public Integer getDestination() {
            return destination;
        }

        public Integer getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "destination=" + destination +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return new EqualsBuilder().append(destination, node.destination).append(weight, node.weight).isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37).append(destination).append(weight).toHashCode();
        }
    }
}
