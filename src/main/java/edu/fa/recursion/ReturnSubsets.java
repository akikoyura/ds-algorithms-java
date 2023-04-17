/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 16, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Problem Statement
    Given an integer array, find and return all the subsets of the array. The order of subsets in the output array is not important. However the order of elements in a particular subset should remain the same as in the input array.

    Note:

    An empty set will be represented by an empty list.
    If there are repeat integers, each occurrence must be treated as a separate entity.
    Example 1

    arr = [9, 9]

    output = [[],
            [9],
            [9],
            [9, 9]]
    Example 2

    arr = [9, 12, 15]

    output =  [[],
           [15],
           [12],
           [12, 15],
           [9],
           [9, 15],
           [9, 12],
           [9, 12, 15]]
 */
public class ReturnSubsets {


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int idx = index; idx < nums.length; idx++) {
            current.add(nums[idx]);
            generateSubsets(nums, idx + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
