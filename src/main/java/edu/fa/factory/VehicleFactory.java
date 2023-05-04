/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.factory;

public final class VehicleFactory {
    public static Vehicle produce(String type) {
        return switch (type) {
            case "sport" -> new SportCar("porsche 911");
            case "suv" -> new SuvCar("skoda kodiaq");
            default -> throw new IllegalArgumentException("""
                    not implemented type: '%s'
                    """.formatted(type));
        };
    }
}
