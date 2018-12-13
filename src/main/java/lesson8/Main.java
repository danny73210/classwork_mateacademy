package lesson8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("RUN_STARTS");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("RUN_ENDS");
        };
        Callable<String> callable = () -> "Hello return";

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(runnable);
        Future<String> callableFuture = executorService.submit(callable);
        try {
            String callableValue = callableFuture.get();
            System.out.println(callableValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
