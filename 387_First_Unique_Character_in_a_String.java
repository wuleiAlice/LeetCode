/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    First Unique Character in a String
 Difficulty: Easy
 Source:  	 https://leetcode.com/problems/first-unique-character-in-a-string/
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

*/



public class Solution {
    public int firstUniqChar(String s) {
        String myString;
        char currentChar;
        if(s.length() == 0) return -1;
        for(int i = 0; i < s.length() ; i++){
            currentChar = s.charAt(i);
            if(s.lastIndexOf(currentChar) == s.indexOf(currentChar)) return i;
        }
        return -1;
    }
}