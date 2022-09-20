package com.practice.pepcoding.graph;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class GraphPath {

    public void printAllPath(GraphNode graphNode , Integer src, Integer dest) {
        Map<Integer, Set<Pair<Integer, Integer>>> graph = graphNode.getGraph();
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

    public void bfsPrint(GraphNode graphNode, Integer src){
        Map<Integer, Set<Pair<Integer, Integer>>> graph = graphNode.getGraph();

        Queue<Pair<Integer,String>> qli = new LinkedList<>();
        qli.add(Pair.of(src,""));
        int[] visited = new int[999];

        while (!qli.isEmpty()){
            Pair<Integer,String> ele = qli.poll();
            Integer nodeSrc = ele.getLeft();
            String printOut = ele.getRight() + nodeSrc;
            System.out.println(printOut);
            for (Pair<Integer, Integer> destis : graph.get(nodeSrc)) {
                if (visited[destis.getLeft()]!=1){
                    qli.add(Pair.of(destis.getLeft(), printOut));
                }
            }
            visited[nodeSrc] = 1;
        }
    }




}
