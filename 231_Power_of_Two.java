
/*
 Author:     Alice, Du Weichao
 Date:       08 Feb 2017
 Problem:    Power of Two
 Difficulty: Easy
 Source:     https://leetcode.com/problems/power-of-two/

Given an integer, write a function to determine if it is a power of two.

Follow up:
Could you do it without using any loop / recursion?

*/


public class Solution {
    public boolean isPowerOfTwo(int n) {
         return n>0 && Integer.bitCount(n) == 1;
    }
}