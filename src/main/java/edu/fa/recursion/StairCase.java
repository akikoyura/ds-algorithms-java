/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 17, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

public class StairCase {
    public static int stairCase(int num) {
        if (num == 0 || num == 1) return 1;
        if (num == 2) return 2;
        if (num == 3) return 4;

        return stairCase(num - 1) + stairCase(num - 2) + stairCase(num - 3);
    }

    public static boolean testFunction(int[] testCase) {
        return true;
    }

    public static void main(String[] args) {
        int result = stairCase(7);
        System.out.println(result);
    }
}
