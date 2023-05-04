package edu.fa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 01, 2023
 * @Version 1.0
 */public class Main {
    public static void test() {
        List<Integer> test = new ArrayList<>();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        var runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome Runnable");
            }
        };
        executorService.execute(runnable);

        executorService.execute(() -> {
            System.out.println("Welcome Runnable");
        });

        var callable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome to Future");
            }
        };
        var futureCallable = executorService.submit(callable);
        Future<String> futureCallableAnonymous = executorService.submit(() -> "Welcome to Future");

        System.out.printf("""
                futureCallable: '%s',
                futureCallableAnonymous: '%s'
                %n""", futureCallable.get(), futureCallableAnonymous.get());
    }
}