/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 23, 2023
 * @Version 1.0
 */
package edu.fa.main.seal;

public non-sealed class Car extends Vehicle implements Service {
    private final int numberOfSeats;

    public Car(int numberOfSeats, String registrationNumber) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Starting engine in Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping engine in Car");
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
