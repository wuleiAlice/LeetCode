/*
 Author:     Alice, Du Weichao
 Date:       20 Mar 2017
 Problem:    Minimum Absolute Difference in BST
 Difficulty: Easy
 Source:    https://leetcode.com/problems/minimum-absolute-difference-in-bst/#/description


Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    LinkedList<Integer> myList = new LinkedList<Integer>();
    
    public int getMinimumDifference(TreeNode root) {
        
        traverseTree(root);
        
        int min = myList.get(1) - myList.get(0);
        
        min = min < 0 ? -min : min;
        
        for(int i = 0; i < myList.size() - 1 ; i ++){
            int temp = myList.get(i + 1) - myList.get(i);
            temp = temp < 0 ? -temp : temp;
            if(min > temp) min = temp;
            if(min == 0) return 0;
        }
        
        return min;
        
    }
    
    public void traverseTree(TreeNode root){
        if (root == null) return;
        traverseTree(root.left);
        myList.add(root.val);
        traverseTree(root.right);
    }
}