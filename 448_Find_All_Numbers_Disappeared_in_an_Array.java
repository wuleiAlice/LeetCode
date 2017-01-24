/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Find All Numbers Disappeared in an Array
 Difficulty: Easy
 Source:     https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 Notes:
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/


public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] appear = new int[nums.length];
        LinkedList<Integer> result = new LinkedList<Integer>();
        
        for(int e : nums )
            appear[e - 1] = 1;
        
        for(int i = 0; i < appear.length; i ++)
            if(appear[i] == 0) result.add(i + 1);
        
        return result;
    }
}