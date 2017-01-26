/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Contains Duplicate
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/contains-duplicate/
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
*/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i ++){
            
            if(nums[i] == nums[i + 1]) return true;
         }
        return false;
    }
}