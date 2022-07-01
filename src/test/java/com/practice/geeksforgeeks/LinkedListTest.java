package com.practice.geeksforgeeks;

import org.junit.jupiter.api.Test;

/**
 * Created by akasshukla on 3/27/17.
 */
public class LinkedListTest {
    @Test
    public void addHead() throws Exception {

        LinkedList list = new LinkedList();
        list.addHead(3);
        list.addHead(2);
        list.addHead(6);
        list.addHead(5);
        list.addHead(11);
        list.addHead(10);
        list.addHead(12);
        list.addHead(15);
//        list.addHead(9);
        list.show();
//        System.out.println(list.getLenthOfList());
//        System.out.println(list.search(6));
//        System.out.println(list.middleElement());
//        list.reverseRecursive();
//        list.createLoop();
//        list.loop();
//        list.insert(4);
//        list.checkPal();
//        NodeN node = list.delAlternate();
//        list.show(node);
        list.reverseAltKthINode(3,0);
        list.show();
    }

    @Test
    public void test() throws Exception {
        int a = 5;
        int b =5;
        if (a>b){
            System.out.println("first");
        }else if (b>a){
            System.out.println("2nd");
        }else {
            System.out.println("last");
        }

    }
}