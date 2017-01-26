
/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Missing Number
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/missing-number/
Given two arrays, write a function to compute their intersection.

Example:
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.
*/



public class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = (1 + length) * length / 2;
        for(int i : nums ) sum -= i;
        return sum;
    }
}