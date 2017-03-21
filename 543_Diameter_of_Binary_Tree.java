/*
 Author:     Alice, Du Weichao
 Date:       11 Mar 2017
 Problem:    Diameter of Binary Tree
 Difficulty: Easy
 Source:	 https://leetcode.com/problems/diameter-of-binary-tree/#/description

 Total Accepted: 2765
Total Submissions: 6391
Difficulty: Easy
Contributors: nagasupreeth
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      //  if(root == null) return 1;
      //  int result = 0;
        if(root == null) return 0;
     //   if(root.right == null) return  diameterOfHalfTree(root.left) + 1;
     //   if(root.left == null) return  diameterOfHalfTree(root.right) + 1;
        diameterOfHalfTree(root);
        return max;
    }
    
    public int diameterOfHalfTree(TreeNode node){
        if(node == null)  return -1;
        int right = diameterOfHalfTree(node.right);
        int left =  diameterOfHalfTree(node.left);
        int sum = (right + 2 + left);
        max = max > sum ? max : sum;
        return  1 + Math.max(left, right);
    }
}