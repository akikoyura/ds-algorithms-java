/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 15, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

public class StringPermutation {
    /*
    Given an input string, return all permutations of the string in an array.

    Example 1:

    string = 'ab'
    output = ['ab', 'ba']
    Example 2:

    string = 'abc'
    output = ['abc', 'bac', 'bca', 'acb', 'cab', 'cba']
     */

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        permute(str, 0, n - 1);
    }
}
