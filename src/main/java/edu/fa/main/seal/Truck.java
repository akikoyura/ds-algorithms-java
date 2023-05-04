/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 23, 2023
 * @Version 1.0
 */
package edu.fa.main.seal;

public final class Truck extends Vehicle implements Service {
    private final int loadCapacity;

    public Truck(int loadCapacity, String registrationNumber) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Starting engine in Truck");
    }

    @Override
    public void stop() {
        System.out.println("Stopping engine in Truck");
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }
}
