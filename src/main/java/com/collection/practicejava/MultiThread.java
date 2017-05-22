package com.collection.practicejava;

/**
 * Created by akasshukla on 5/17/17.
 */
public class MultiThread {

    Runnable run = () ->
            System.out.println("A");
    Runnable run1 = () ->
            System.out.println("B");

    public static void main(String[] args) {
        MultiThread m = new MultiThread();
        m.doSomeThing();
        System.out.println("main");
    }

    private void doSomeThing() {
        Thread t = new Thread(run);
        Thread t1 = new Thread(run1);
        t.start();
        t1.start();
    }

}
