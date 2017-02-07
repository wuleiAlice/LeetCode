/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Add Strings
 Difficulty: Easy
 Source:     https://leetcode.com/problems/add-strings/
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class Solution {
    public String addStrings(String num1, String num2) {
        int number1 = 0;
        int number2 = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int currentDigit = 0;

        String result = "";
        StringBuilder sb;
        
        while(i >= 0 || j >= 0){
            number1 = (i >= 0)? convertCharToDigit(num1.charAt(i)) : 0;
            number2 = (j >= 0)? convertCharToDigit(num2.charAt(j)) : 0;
            currentDigit += number1 + number2;
            result += convertDigitToChar(currentDigit % 10);
            currentDigit = currentDigit > 9 ? 1 : 0;
            i --;
            j --;
        }
        if(currentDigit == 1) result += convertDigitToChar(currentDigit);
        sb = new StringBuilder(result);
        sb.reverse();
        return sb.toString();
        
    }
    
    public int convertCharToDigit(char c){
        switch(c){
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return 0;
        }
    }
    
    public char convertDigitToChar(int i){
        switch(i){
            case 0: return '0';
            case 1: return '1';
            case 2: return '2';
            case 3: return '3';
            case 4: return '4';
            case 5: return '5';
            case 6: return '6';
            case 7: return '7';
            case 8: return '8';
            case 9: return '9';
            default: return '0';
        }
    }
}