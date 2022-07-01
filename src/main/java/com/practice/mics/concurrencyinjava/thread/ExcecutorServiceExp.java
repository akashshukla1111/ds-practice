package com.practicejava.thread;

import java.util.concurrent.*;

/**
 * Created by akasshukla on 6/4/16.
 */
public class ExcecutorServiceExp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        ExcecutorServiceExp tet = new ExcecutorServiceExp();
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

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //Runnable
        Future<?> submit = executorService.submit(
                () -> System.out.println("this method run() is only did the job no, return"));
        System.out.println("runnable checking :"+ submit.get());

        //Callable
        Future<String> submit1 = executorService.submit(() -> "this method do the job and return the value call() ");
        System.out.println(submit1.get());
    }

    public void executorServ() throws ExecutionException, InterruptedException {

        RunnableFuture<String> target = new FutureTask<>(() -> "Callable findTheDigitAfterDecimal");
        Thread thread = new Thread(target);
        thread.start();
        System.out.println(target.get());
    }
}
