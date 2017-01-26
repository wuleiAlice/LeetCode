/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Excel Sheet Column Number
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/excel-sheet-column-number/
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

*/



public class Solution {
    public int titleToNumber(String s) {
        String letters = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;
        int power = 1;
        for(int i = s.length() - 1; i > -1; i --){
            result += power * letters.indexOf(s.charAt(i));
            power *= 26;
        }
        return result;
    }
}