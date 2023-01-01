package com.vc.asynch;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/*
Completable Future Example
 */
public class AsynchSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Completable Future which takes Runnable as an argument , it doesn't return value
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(" Hello ");
            } catch (InterruptedException ex) {
                throw new IllegalStateException("Interrupted");
            }
        });
        future.get();

        // Completable Future which takes Supplier as an argument, and it  returns value
        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                throw new IllegalStateException("Interrupted");
            }
            return "supplyFuture";
        });
        System.out.println(supplyFuture.get());

        // Completable Future which uses callback methods to combine the results
        CompletableFuture<String> supplyFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                throw new IllegalStateException("Interrupted");
            }
            return "VC";
        }).thenApply(str -> str + " Vinoth")
        .thenApply(str -> str + " Welcome");
        System.out.println(supplyFuture1.get());
    }
}

