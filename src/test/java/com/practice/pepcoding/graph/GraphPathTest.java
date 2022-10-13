package com.practice.pepcoding.graph;

import org.junit.jupiter.api.Test;

class GraphPathTest {

    @Test
    void printAllPathDfs() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6)
                .add(4, 5)
                .add(5, 7)
                .add(6, 7)
                .add(6, 8)
                .add(8, 9)
                .add(8, 10)
                .add(9, 10)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.printAllPath(graphRoute, 4, 10);
    }

    @Test
    void printBfs() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6)
                .add(4, 5)
                .add(5, 7)
                .add(6, 7)
                .add(6, 8)
                .add(8, 9)
                .add(8, 10)
                .add(9, 10)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.bfsPrint(graphRoute, 7);
    }

    @Test
    void dejstraFindPath() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6, 10)
                .add(4, 5, 10)
                .add(5, 7, 20)
                .add(6, 7, 40)
                .add(6, 8, 4)
                .add(8, 9, 7)
                .add(8, 10, 5)
                .add(9, 10, 12)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.dijkstraPath(graphRoute, 6);

    }

    @Test
    void primsAlgo() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6, 10)
                .add(4, 5, 10)
                .add(5, 7, 20)
                .add(6, 7, 40)
                .add(6, 8, 4)
                .add(8, 9, 7)
                .add(8, 10, 5)
                .add(9, 10, 12)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.primsAlgo(graphRoute, 6);
    }
}