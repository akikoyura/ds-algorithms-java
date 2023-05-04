/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 23, 2023
 * @Version 1.0
 */
package edu.fa.main.seal;

public sealed interface Service permits Car, Truck {

    void start();

    void stop();

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100_000;
    }

}
