package com.practice.pepcoding.graph;

import org.junit.jupiter.api.Test;

class GraphPathTest {

    @Test
    void printAllPathDfs() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6)
                .add(4, 5)
                .add(5, 4)
                .add(5, 7)
                .add(7, 6)
                .add(7, 5)
                .add(6, 7)
                .add(6, 4)
                .add(6, 8)
                .add(8, 6)
                .add(8, 9)
                .add(8, 10)
                .add(9, 10)
                .add(9, 8)
                .add(10, 9)
                .add(10, 8)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.printAllPath(graphRoute,4,10);
    }

    @Test
    void printBfs() {
        GraphNode graphRoute = GraphNode.builder()
                .add(4, 6)
                .add(4, 5)
                .add(5, 4)
                .add(5, 7)
                .add(7, 6)
                .add(7, 5)
                .add(6, 7)
                .add(6, 4)
                .add(6, 8)
                .add(8, 6)
                .add(8, 9)
                .add(8, 10)
                .add(9, 10)
                .add(9, 8)
                .add(10, 9)
                .add(10, 8)
                .build();
        GraphPath graphPath = new GraphPath();
        graphPath.bfsPrint(graphRoute,7);
    }
}