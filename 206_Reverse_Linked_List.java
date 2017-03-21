/*
 Author:     Alice, Du Weichao
 Date:       11 Mar 2017
 Problem:    Reverse Linked List
 Difficulty: Easy
 Source:	 https://leetcode.com/problems/reverse-linked-list/#/description

Reverse a singly linked list.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}