/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 08, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {

    public static int factorial(int number) {
        if (number == 1 || number == 0) return 1;

        return number + factorial(number - 1);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static List<List<Integer>> permutations(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (list.size() == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int index = 0; index < list.size(); index++) {
            int m = list.get(index);
            List<Integer> remaining = new ArrayList<>(list.subList(0, index));
            remaining.addAll(list.subList(index + 1, list.size()));
            for (List<Integer> p : permutations(remaining)) {
                p.add(0, m);
                result.add(p);
            }
        }
        return result;
    }


    public static int[] addOne(int[] arr) {
        return addOneHelper(arr, arr.length - 1);
    }

    public static int[] addOneHelper(int[] arr, int index) {
        if (index < 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            return newArr;
        }

        if (arr[index] == 9) {
            arr[index] = 0;
            return addOneHelper(arr, index - 1);
        } else {
            arr[index]++;
            return arr;
        }
    }

    // Merge sort
    // Binary Tree traversal
    // Subset sum
    // Tower of Hanoi with 4 pegs
    // Maze solving
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        System.out.println(Arrays.toString(addOne(arr)));

        List<Integer> list = List.of(0, 1, 2);
        System.out.println(permutations(list));
    }
}
