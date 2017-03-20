/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Longest Palindrome
 Difficulty: Easy
 Source:     https://leetcode.com/problems/longest-palindrome/
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/


public class Solution {
    public int longestPalindrome(String s) {
        String letters = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int maxOdd = 0;
        int result = 0;
        int count = 0;
        boolean gotOdd = false;
        for(int i = 0; i < 52; i ++){
            count = 0;
            for(int j = 0; j < s.length(); j ++){
                if(s.charAt(j) == letters.charAt(i)) count ++;
            }
            
            if(count % 2 == 0) result += count;
            else{ 
                result += count - 1;
                gotOdd = true;
            }
        }
        if(gotOdd) result ++;
        return result;
    }
}