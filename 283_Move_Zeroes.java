/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    SMove Zeroes
 Difficulty: Easy
 Source:     https://leetcode.com/problems/move-zeroes/
 Notes:
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*/




public class Solution {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> myList= new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i ++)
            if(nums[i] != 0) myList.add(i);
        
        for(int i = 0; i < nums.length; i ++)
           if(myList.size() != 0)
                nums[i] = nums[myList.removeFirst()];
            else
                nums[i] = 0;
    }
}