
/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Intersection of Two Arrays II
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/intersection-of-two-arrays-ii/
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
*/


public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] myArray = new int[nums2.length];
        int[] result;
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j ++){
                if(nums1[i] == nums2[j] && myArray[j] == 0){ myArray[j] = 1;
                count ++;
                break;
                }
            }
        }
        result = new int[count];
        count = 0;
        for(int i = 0; i < nums2.length; i++){
            if(myArray[i] == 1) {
                result[count] = nums2[i];
                count++;
            }
        }
        return result;
    }
}