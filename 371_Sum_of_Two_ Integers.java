
/*
 Author:     Alice, Du Weichao
 Date:       08 Feb 2017
 Problem:    Sum of Two Integers
 Difficulty: Easy
 Source:     https://leetcode.com/problems/sum-of-two-integers/
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/


public class Solution {
    public int getSum(int a, int b) {
        if(b > 0)   for(int i = 0; i < b; i ++) a++;
        else        for(int i = 0; i > b; i --) a--;
        return a;
    }
}