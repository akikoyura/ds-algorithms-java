/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 23, 2023
 * @Version 1.0
 */
package edu.fa.main.seal;

public class Main {
    public static void main(String[] args) {
        var inputNumber = 42;

        String textNumber = switch (inputNumber) {
            case 22, 42 -> String.valueOf(inputNumber);
            default -> throw new RuntimeException("Not Allowed");
        };


        System.out.printf("""
                number: '%s'
                %n
                """, textNumber);
    }
}

record Example(int number, String text) {
    private String getTogether() {
        return number + text;
    }

}
