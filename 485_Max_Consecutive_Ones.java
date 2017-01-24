/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Max Consecutive Ones
 Difficulty: Easy
 Source:     https://leetcode.com/problems/max-consecutive-ones/
 Notes:
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
*/



public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> zero = new ArrayList<Integer> ();
        int result = 0;
        zero.add(-1);
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0) zero.add(i);
        }
        zero.add(nums.length);
        for(int i = 1; i < zero.size(); i ++ ){
            if(zero.get(i) - zero.get(i-1) - 1 > result) result = zero.get(i) - zero.get(i-1) - 1 ;
        }
        return result;
    }
}