/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 17, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

public class LastIndex {
    public static int lastIndex(int[] arr, int element, int index) {
        if (index < 0) return -1;
        if (arr[index] == element) {
            return index;
        } else {
            return lastIndex(arr, element, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 4};
        System.out.println(lastIndex(arr, 5, 4));
    }
}
