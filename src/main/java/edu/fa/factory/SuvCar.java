/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.factory;

public class SuvCar implements Vehicle {
    private final String type;

    public SuvCar(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.printf("""
                SuvCar, type: '%s', move
                """, type);
    }
}
