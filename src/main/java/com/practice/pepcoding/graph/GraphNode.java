package com.practice.pepcoding.graph;


import com.google.common.collect.Sets;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphNode {

    private Map<Integer, Set<Pair<Integer, Integer>>> graph;

    public GraphNode(GraphRouteBuilder that) {
        this.graph = that.graph;
    }

    public Map<Integer, Set<Pair<Integer, Integer>>> getGraph() {
        return graph;
    }

    public static GraphRouteBuilder builder() {
        return new GraphRouteBuilder();
    }

    public static class GraphRouteBuilder {

        private Map<Integer, Set<Pair<Integer, Integer>>> graph;

        public GraphRouteBuilder() {
            this.graph = new LinkedHashMap<>();
        }

        public GraphRouteBuilder add(Integer src, Integer dest) {
             add(src, dest, 0);
             return this;
        }

        public GraphRouteBuilder add(Integer src, Integer dest, Integer weight) {
            if (Objects.isNull(this.graph.get(src))) {
                this.graph.put(src, Sets.newHashSet(Pair.of(dest, weight)));
            }
            Set<Pair<Integer, Integer>> destWList = this.graph.get(src);
            destWList.add(Pair.of(dest, weight));
            return this;
        }

        public GraphNode build() {
            return new GraphNode(this);

        }

    }
}
