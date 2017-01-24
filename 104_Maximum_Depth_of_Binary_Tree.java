
/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Maximum Depth of Binary Tree
 Difficulty: Easy
 Source:     https://leetcode.com/problems/maximum-depth-of-binary-tree/
 Notes:
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}