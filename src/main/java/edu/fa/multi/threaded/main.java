/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 25, 2023
 * @Version 1.0
 */
package edu.fa.multi.threaded;

public class main {
    public static void main(String[] args) {
        var t = new Thread(() -> {
            while(true) {
                System.out.println("Welcome Thread!");
            }
        });
        t.setDaemon(true);
        t.start();
    }
}
