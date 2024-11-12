package com.example.demo.testexample;

import org.junit.Test;

import java.util.Optional;
import java.util.concurrent.*;

public class ExceptionTest {


    /**
     * 异常追踪
     */
    @Test(expected = ArithmeticException.class)
    public void exceptionTest() {
        System.out.println("in exception success test");
        int a = 0;
        int b = 1 / a;
    }

    @Test(expected = NullPointerException.class)
    public void exceptionFailTest() {
        System.out.println("in exception fail test");
        int a = 0;
        int b = 1 / a;
        String s = "sss";

        Optional.ofNullable(s)
                .map(s1 ->{
                    System.out.println(s1);
                    return "ss";
                })
                .orElseGet(()->{
            return "sss";});
    }

    public static void main(String[] args) {
        String s = null;

        String s2 = Optional.ofNullable(s)
                .map(s1 -> {
                    System.out.println(s1);
                    return "ss";
                })
                .orElseGet(() -> {
                    return "sss";
                });
        System.out.println("final result:"+s2);


    }

    public Object doGet() {
        ExecutorService threadPool1 = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100));
        CompletableFuture cf1 = CompletableFuture.supplyAsync(() -> {
            //do sth
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("child");
                return "child";
            }, threadPool1).join();//子任务
        }, threadPool1);
        return cf1.join();
    }

}
