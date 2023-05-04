/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.abstr.factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProvider.getFactory("car");
        Vehicle slowCar = carFactory.createVehicle("slow");
        slowCar.move();

        Calendar c = new GregorianCalendar();
    }

}
