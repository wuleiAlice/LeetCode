
/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Plus One
 Difficulty: Easy
 Source:     https://leetcode.com/problems/plus-one/
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        int currentDigit = 0;
        for(int i = digits.length - 1; i >= 0; i --){
            if(i == digits.length - 1) currentDigit += 1 + digits[i];
            else currentDigit += digits[i];
            
            digits[i] = currentDigit % 10;
            if(currentDigit > 9) currentDigit = 1;
            else currentDigit = 0;
        }
        if(currentDigit == 1){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 0; i < digits.length; i ++){
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}