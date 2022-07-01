package com.practice.mics.concurrencyinjava.thread;

/**
 * Created by akasshukla on 5/17/17.
 */
public class MultiThread {

    int i=1;

    Runnable even = new Runnable() {
        @Override
        public void run() {
            printEven();
        }
    };

    private void printEven() {
        synchronized (this){
            while (i<=10){
                if (i%2!=0){
                    try {
                        this.wait();
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                System.out.println("even :"+i);
                i++;
                this.notify();
                }
            }
        }

    }

    Runnable odd = new Runnable() {
        @Override
        public void run() {
            printOdd();
        }
    };

    private void printOdd() {
        synchronized (this){
            while (i<=10){
                if (i%2==0){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                System.out.println("odd "+i);
                i++;
                this.notify();
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThread multiThread=new MultiThread();
        multiThread.doSomeThing();
    }

    private void doSomeThing() throws InterruptedException {
        Thread threadEven = new Thread(even,"EVEN");
        Thread threadOdd = new Thread(odd,"ODD");
        threadEven.start();
        threadOdd.start();
    }

    Runnable eventest = () -> {
        int i=1;
        while (i<=10){
            if (i%2==0){
                System.out.println("EVEN :"+i);
            }
                i++;
        }
    };
    Runnable oddtest = () -> {
        int i=1;
        while (i<=10){
            if (i%2!=0){
                System.out.println("ODD "+i);
            }
                i++;
        }
    };

}
