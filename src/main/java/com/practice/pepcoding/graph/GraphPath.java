package com.practice.pepcoding.graph;

import com.practice.pepcoding.graph.GraphNode.Node;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import java.util.*;
import java.util.stream.Collectors;

public class GraphPath {

    public void printAllPath(GraphNode graphNode , Integer src, Integer dest) {
        Map<Integer, Set<Node>> graph = graphNode.getGraph();
        if (Objects.isNull(graph.get(src))) {
            return;
        }
        Map<Integer, Boolean> visited = graph.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, t -> false));
        printPath(graph, src, dest,visited, "");
    }

    private void printPath(Map<Integer, Set<Node>> graph, Integer src, Integer dest, Map<Integer, Boolean> visited, String output) {

        if (visited.get(src) || graph.get(src)==null){
            return;
        }
        output = output + src;
        if (src.equals(dest)){
            System.out.println(output);
        }
        visited.put(src,true);
        Set<Node> dests = graph.get(src);

        for (Node pp : dests) {
            printPath(graph, pp.getDestination(), dest, visited, output);
        }
        visited.put(src,false);
    }

    public void bfsPrint(GraphNode graphNode, Integer src){
        Map<Integer, Set<Node>> graph = graphNode.getGraph();
        Queue<Pair<Integer,String>> qli = new LinkedList<>();
        qli.add(Pair.of(src,""));
        int[] visited = new int[999];
        while (!qli.isEmpty()){
            Pair<Integer,String> ele = qli.poll();
            Integer nodeSrc = ele.getLeft();
            String printOut = ele.getRight() + nodeSrc;
            System.out.println(printOut);
            for (Node destis : graph.get(nodeSrc)) {
                if (visited[destis.getDestination()]!=1){
                    qli.add(Pair.of(destis.getDestination(), printOut));
                }
            }
            visited[nodeSrc] = 1;
        }
    }

    public void dijkstraPath(GraphNode graphNode, Integer src ){
        Map<Integer, Set<Node>> graph = graphNode.getGraph();

        PriorityQueue<Triple<Integer,Integer,String>> qu = new PriorityQueue<>((Comparator.comparingInt(Triple::getMiddle)));
        qu.add(Triple.of(src, 0, "" + src));

        int[] vertexVisited = new int[999];

        while (qu.size()>0){
            Triple<Integer,Integer,String> nd = qu.poll();
            System.out.println(nd.getLeft() + "  psf : " + nd.getRight() + " weight :" + nd.getMiddle());

            if (vertexVisited[nd.getLeft()] != 1) {
                Set<Node> dests = graph.get(nd.getLeft());
                for (Node dest : dests) {
                    if (vertexVisited[dest.getDestination()]!=1){
                        Triple<Integer, Integer, String> qNode = Triple.of(dest.getDestination(), nd.getMiddle() + dest.getWeight(), nd.getRight() + dest.getDestination());
                        qu.add(qNode);
                    }
                }
                vertexVisited[nd.getLeft()]=1;
            }
        }
    }
}
