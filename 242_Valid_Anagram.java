
/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Valid Anagram
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/valid-anagram/
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/





public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        s = new String( sChar);
        t = new String (tChar);
        return s.contentEquals(t);
    }
}