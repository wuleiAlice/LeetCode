/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Single Number
 Difficulty: Easy
 Source:     https://leetcode.com/problems/single-number/
 Notes:
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/




public class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i ++)
            result ^= nums[i];
        return result;
    }
}