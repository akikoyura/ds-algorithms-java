/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.abstr.factory;

import edu.fa.factory.Vehicle;

public class FastCar implements Vehicle {

    @Override
    public void move() {
        System.out.println("Fast Car, Move");
    }
}
