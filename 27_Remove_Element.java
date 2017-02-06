/*
 Author:     Alice, Du Weichao
 Date:       06 Feb 2017
 Problem:    Remove Element
 Difficulty: Easy
 Source:     https://leetcode.com/problems/remove-element/
 Notes:
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
*/



public class Solution {
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        int tail = nums.length - 1;
    
        for(int i = 0; i < tail + 1; i++){
            if(nums[i] == val) {
                swap(nums, i, tail);
                tail --;
                result --;
                i--;
            }
        }
        return result;
    }
    
    public int[] swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return nums;
    }
}