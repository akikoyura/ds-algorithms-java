/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 15, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Problem Statement
    Define a procedure, deep_reverse, that takes as input a list, and returns a new list that is the deep reverse of the input list.
    This means it reverses all the elements in the list, and if any of those elements are lists themselves, reverses all the elements in the inner list, all the way down.

    Note: The procedure must not change the input list itself.

    Example
    Input: [1, 2, [3, 4, 5], 4, 5]
    Output: [5, 4, [5, 4, 3], 2, 1]

    Hint

    Begin with a blank final list to be returned.
    Traverse the given list in the reverse order.
    If an item in the list is a list itself, call the same function.
    Otheriwse, append the item to the final list.
 */
public class DeepReverse {

    @SuppressWarnings("unchecked")
    public static List<Object> deepReverse(List<Object> list) {

        List<Object> reversedItems = new ArrayList<>();
        for (Object element : list) {
            if (element instanceof List) {
                reversedItems.add(deepReverse((List<Object>) element));
            } else {
                reversedItems.add(element);
            }
        }
        Collections.reverse(reversedItems);
        return reversedItems;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(List.of(3, 4));
        list.add(List.of(5, List.of(6, 7)));
        List<Object> reversedList = deepReverse(list);
        System.out.println(reversedList);
    }
}
