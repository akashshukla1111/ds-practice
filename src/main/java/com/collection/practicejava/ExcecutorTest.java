package com.collection.practicejava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by akasshukla on 6/4/16.
 */
public class ExcecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        ExcecutorTest tet = new ExcecutorTest();
        tet.executorServ();
        Future<String> tast = executor.submit(() -> {
            Thread.sleep(1000);
            return "hello world";
        });
        Future<String> tast2 = executor.submit(() -> "hello wrold again");

        try {
            System.out.println(tast.get(1000, TimeUnit.MILLISECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(tast2.get());

        executor.shutdown();
        
        

    }

    public void executorServ() throws ExecutionException, InterruptedException {

        RunnableFuture<String> target = new FutureTask<>(() -> "Callable test");
        Thread thread = new Thread(target);
        thread.start();
        System.out.println(target.get());



    }
}
