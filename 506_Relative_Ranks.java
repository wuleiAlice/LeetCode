/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Relative Ranks
 Difficulty: Easy
 Source:     https://leetcode.com/problems/relative-ranks/
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i ++){
            myList.add(nums[i]);
        }
        Collections.sort(myList);
        Collections.reverse(myList);
        for(int i = 0; i < nums.length; i ++){
            Integer intObj = new Integer(nums[i]);
            if(myList.indexOf(nums[i]) == 0 ) result[i] = "Gold Medal";
            else if (myList.indexOf(nums[i]) == 1 ) result[i] = "Silver Medal";
            else if (myList.indexOf(nums[i]) == 2 ) result[i] = "Bronze Medal";
            else result[i] = Integer.toString(myList.indexOf(intObj) + 1);//.toString();
        }
        return result;
    }
}