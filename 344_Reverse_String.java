/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Reverse String
 Difficulty: Easy
 Source:     https://leetcode.com/problems/reverse-string/
 Notes:
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/



public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}