/*
 Author:     Alice, Du Weichao
 Date:       20 Mar 2017
 Problem:    Assign Cookies
 Difficulty: Easy
 Source:     https://leetcode.com/problems/assign-cookies/#/description


Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

Note:
You may assume the greed factor is always positive. 
You cannot assign more than one cookie to one child.

Example 1:
Input: [1,2,3], [1,1]

Output: 1

Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
Example 2:
Input: [1,2], [1,2,3]

Output: 2

Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
*/



public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        for(int i = 0; i < g.length; i ++){
               int pos = -1;
                int min = 999999999;
               int temp;
            for(int j = 0; j < s.length; j ++){
                temp = s[j] -g[i];
                if(temp < min && temp > -1 ) {
                    min = temp;
                    pos = j;                   
                }              
            }           
            if(pos != -1) {
                s[pos] = 0;
                 result ++;
            }
        }        
        return result;
    }
}