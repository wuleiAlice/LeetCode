/*
 Author:     Alice, Du Weichao
 Date:       11 Mar 2017
 Problem:    Number of Boomerangs
 Difficulty: Easy
 Source:	 https://leetcode.com/problems/number-of-boomerangs/#/description

Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
*/


/*
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        double[][] matrix = new double[points.length][points.length];
        for(int i = 0; i < points.length; i ++)
            for(int j = i; j < points.length; j ++){
                matrix[i][j] = Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2);
                matrix[j][i] = matrix[i][j];
            }
                
        for(int i = 0; i < points.length; i ++)
            for(int j = 0; j < points.length - 1; j ++){
                if(j == i)  continue;
                for(int k = j + 1; k < points.length; k ++) {
                    if(k == i)  continue;
                    if(matrix[i][j] == matrix[i][k]) result ++;
                }
            }
        return 2 * result;        
    }
}

*/


public class Solution {
    
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < points.length; i ++){
            for(int j = 0; j < points.length; j ++){
                if(i == j)  continue;
                int distance = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0]) + (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);
                int prevDist = myMap.containsKey(distance)? myMap.get(distance) : 0;
                result += 2 * prevDist;
                myMap.put(distance, prevDist + 1);
            }
                
            myMap.clear();
        }
        return result;        
    }
}