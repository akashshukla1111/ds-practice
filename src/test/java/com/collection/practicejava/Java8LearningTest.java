package com.collection.practicejava;

import org.junit.Test;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

interface checking {
    void printVal();
//        int add(int a, int b);
}

/**
 * Created by akasshukla on 2/24/17.
 */
public class Java8LearningTest {


    @Test
    public void executorTest() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(() -> getValueFromServer());
        System.out.println("this is exexutor serv");
        System.out.println(submit.get());
    }

    @Test
    public void completabelFutureTest() throws ExecutionException, InterruptedException {


        System.out.println("this is exexutor serv");

        CompletableFuture.<Object>supplyAsync(() -> getValueFromServerdelay()).thenApply(sd -> {
            System.out.println("this is new way" + sd);
            return sd;
        });
        CompletableFuture.supplyAsync(() -> getValueFromServer()).thenApply(s -> {
            System.out.println("this is new way" + s);
            return s;
        });
        System.out.println("this is last step");

//        System.out.println(stringCompletableFuture.get());

    }

    public String getValueFromServer() {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t.run();
        return "value from the server after 3 min.";
    }

    public String getValueFromServerdelay() {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t.run();
        return "value from the server after 6 min.";
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {

        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;

    }

    @Test
    public void testing() {
        checking checking = () -> System.out.println("akash shukla");
        checking.printVal();
    }

}