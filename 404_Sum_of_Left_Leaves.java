
/*
 Author:     Alice, Du Weichao
 Date:       25 Jan 2017
 Problem:    Sum of Left Leaves
 Difficulty: Easy
 Source:     https://leetcode.com/problems/sum-of-left-leaves/
 Notes:
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null)
                return root.left.val +  sumOfLeftLeaves(root.right);
        }
       
        return  sumOfLeftLeaves(root.left) +  sumOfLeftLeaves(root.right);
   
    }
}