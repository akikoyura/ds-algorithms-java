/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.abstr.factory;

public final class FactoryProvider {
    private FactoryProvider() {}

    public static AbstractFactory getFactory(String type) {
        return switch (type) {
            case "car" -> new CarFactory();
            case "truck" -> new TruckFactory();
            default -> throw new IllegalArgumentException("""
                    this is %s
                    """.formatted(type));
        };
    }
}
