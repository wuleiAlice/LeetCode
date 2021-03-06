
/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Search a 2D Matrix
 Difficulty: Medium
 Source:     https://leetcode.com/problems/search-a-2d-matrix/
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
*/


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target) return true;
                if(matrix[i][j] > target) return false;
            }
        }
        return false;
    }
}