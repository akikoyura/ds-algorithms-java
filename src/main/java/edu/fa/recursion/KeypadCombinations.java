/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 15, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinations {

    public static void keypadCombination(String digits, String output, String[] letters, List<String> result) {
        if (digits.length() == 0) {
            result.add(output);
            return;
        }
        int digit = Integer.parseInt(digits.substring(0, 1));
        String letterForDigit = letters[digit];
        for (int i = 0; i < letterForDigit.length(); i++) {
            char letter = letterForDigit.charAt(i);
            keypadCombination(digits.substring(1), output + letter, letters, result);
        }
    }

    public static List<String> getAllCombination(String digits) {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        keypadCombination(digits, "", letters, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getAllCombination("23"));
    }

}
