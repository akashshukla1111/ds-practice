package com.collection.practicejava;

import java.util.concurrent.*;

/**
 * Created by akasshukla on 6/4/16.
 */
public class ExcecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

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
}
