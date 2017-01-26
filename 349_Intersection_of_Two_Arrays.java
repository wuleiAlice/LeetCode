/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Intersection of Two Arrays
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/intersection-of-two-arrays/
 Notes:
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.

*/


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedList<Integer > myList = new LinkedList<Integer>() ;
        int[] temp2 = new int[nums2.length];
        int total = 0;
        int count = 0;
        int[] result;
    
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && temp2[j] == 0){
                    temp2[j] = 1;
                    if(!myList.contains(nums1[i])) myList.add(nums1[i]);
                    break;
                }
            }
        }
        
        result = new int[myList.size()];
        for(int i = 0; i < myList.size(); i++){
            result[i] = myList.get(i);
        }
        return result;
    }
}