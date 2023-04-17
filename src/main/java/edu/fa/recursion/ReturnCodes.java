/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 15, 2023
 * @Version 1.0
 */
package edu.fa.recursion;

import java.util.ArrayList;
import java.util.List;

/*
    Problem statement
    In an encryption system where ASCII lower case letters represent numbers in the pattern a=1, b=2, c=3... and so on, find out all the codes that are possible for a given input number.

    Example 1
    number = 123
    codes_possible = ["aw", "abc", "lc"]
    Explanation: The codes are for the following number:

    1 . 23 = "aw"
    1 . 2 . 3 = "abc"
    12 . 3 = "lc"

    Example 2
    number = 145
    codes_possible = ["ade", "ne"]
    Return the codes in a list. The order of codes in the list is not important.
 */
public class ReturnCodes {

    public static List<String> generateCodes(int num) {
        if (num == 0) {
            List<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }
        int remainder = num % 10;
        List<String> codes = new ArrayList<>();
        if (remainder != 0) {
            List<String> suffixes = generateCodes(num / 10);
            for (String suffix : suffixes) {
                char code = (char) (remainder + 96);
                codes.add(suffix + code);
            }
        } else {
            codes = generateCodes(num / 10);
        }
        return codes;
    }

    public static void main(String[] args) {
        int num = 123;
        List<String> result = generateCodes(num);
        System.out.println(result);
    }
}
