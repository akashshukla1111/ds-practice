package com.practice.pepcoding.graph;


import com.google.common.collect.Sets;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphRoute {

    private Map<Integer, Set<Pair<Integer, Integer>>> graph;

    public GraphRoute(GraphRouteBuilder that) {
        this.graph = that.graph;
    }

    public void printAllPath(Integer src, Integer dest) {
        if (Objects.isNull(graph.get(src))) {
            return;
        }
        Map<Integer, Boolean> visited = graph.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, t -> false));
        printPath(graph, src, dest,visited, "");
    }

    private void printPath(Map<Integer, Set<Pair<Integer, Integer>>> graph, Integer src, Integer dest, Map<Integer, Boolean> visited, String output) {

        if (visited.get(src) || graph.get(src)==null){
            return;
        }
        output = output + src;
        if (src.equals(dest)){
            System.out.println(output);
        }
        visited.put(src,true);
        Set<Pair<Integer, Integer>> dests = graph.get(src);

        for (Pair<Integer, Integer> pp : dests) {
            printPath(graph, pp.getKey(), dest, visited, output);
        }
        visited.put(src,false);
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
             add(src, 0, dest);
             return this;
        }

        public GraphRouteBuilder add(Integer src, Integer weight, Integer dest) {
            if (Objects.isNull(this.graph.get(src))) {
                this.graph.put(src, Sets.newHashSet(Pair.of(dest, weight)));
            }
            Set<Pair<Integer, Integer>> destWList = this.graph.get(src);
            destWList.add(Pair.of(dest, weight));
            return this;
        }

        public GraphRoute build() {
            return new GraphRoute(this);

        }

    }
}
