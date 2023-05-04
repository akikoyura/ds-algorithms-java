/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.abstr.factory;

public class TruckFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle(String type) {
        return switch (type) {
            case "heavy" -> new HeavyTruck();
            case "light" -> new LightTruck();
            default -> throw new IllegalArgumentException("not Implemented");
        };
    }
}
