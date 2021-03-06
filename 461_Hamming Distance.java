/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Hamming Distance
 Difficulty: Easy
 Source:     https://leetcode.com/problems/hamming-distance/
 Notes:
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.


Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */
 
 public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
 

