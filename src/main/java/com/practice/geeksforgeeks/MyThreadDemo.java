package com.geeksforgeeks.practice;

/**
 * Created by akashshukla on 14/01/16.
 */
public class MyThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Display d = new Display();
        MyThread t = new MyThread(d,"akash");
        MyThread t1 = new MyThread(d,"ashish");
        t.start();
        t1.start();
    }
}

class MyThread extends Thread{
    private String name;
    private Display d;

    public MyThread(Display d , String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

class Display {
    public synchronized void wish(String name){
        for (int i=0 ; i<10; i++) {
            System.out.printf("Hello : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}