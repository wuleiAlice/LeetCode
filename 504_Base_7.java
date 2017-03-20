/*
 Author:     Alice, Du Weichao
 Date:       20 Mar 2017
 Problem:    Base 7
 Difficulty: Easy
 Source:     https://leetcode.com/problems/base-7/#/description

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
*/


public class Solution {
    public String convertToBase7(int num) {
        String myStr = "";
        boolean neg = false;
        if(num == 0) return "0";
        
        if(num < 0) {
            num *= -1;
            neg = true;
        }
        while(num != 0) {
            myStr += Integer.toString(num % 7);
            num /= 7;
        }
        if(neg) myStr += "-";
        
        return new StringBuilder(myStr).reverse().toString();
    }
}