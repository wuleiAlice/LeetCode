
/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Majority Element
 Difficulty: Easy
 Source:  	 https://leetcode.com/submissions/detail/90631223/
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/



public class Solution {
    public int majorityElement(int[] nums) {

        Integer[] myNum = new Integer[1 + nums.length / 2];
        Integer[] myCount = new Integer[1 + nums.length / 2];
        int count = 0;
        int max = 0;

        for(int i = 0; i < (1 + nums.length / 2) ; i++){
            myNum[i] = 0;
            myCount[i] = 0;
        }
    
        for(int i = 0; i < nums.length; i++){
            if(Arrays.asList(myNum).contains(nums[i])) 
                myCount[Arrays.asList(myNum).indexOf(nums[i])] ++;// = nums[i]; 
            
            else{
                myNum[count] = nums[i];
                myCount[count] = 1;
                count++;
            }
        }
        
        for(Integer i : myCount) if(i> max) max = i;
        
        return myNum[Arrays.asList(myCount).indexOf(max)];
        
    }
}