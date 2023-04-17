/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 15, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

public class TowerOfHaNoi {

    public static void towerOfHaNoiSolve(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod: " + fromRod + " to rod: " + toRod);
            return;
        }
        towerOfHaNoiSolve(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod: " + fromRod + " to rod: " + toRod);
        towerOfHaNoiSolve(n - 1, auxRod, toRod, fromRod);
    }

    public static void towerOfHanoi(int numDisks) {
        towerOfHaNoiSolve(numDisks, 'S', 'D', 'A');
    }

    public static void main(String[] args) {
        towerOfHanoi(3);
    }
}
