
/*
 Author:     Alice, Du Weichao
 Date:       08 Feb 2017
 Problem:    Power of Three
 Difficulty: Easy
 Source:     https://leetcode.com/problems/power-of-three/

Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

*/


public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
       return 1162261467 % n == 0; // 3 ^ 19
    }
}