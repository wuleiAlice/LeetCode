/*
 Author:     Alice, Du Weichao
 Date:       14 Mar 2017
 Problem:    Detect Capital
 Difficulty: Easy
 Source:     https://leetcode.com/problems/detect-capital/#/description


Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
*/









public class Solution {
    public boolean detectCapitalUse(String word) {
        int myCase = 0;//0-all small 1-initial big 2 all big
        for(int i = 0; i < word.length(); i ++){
            if(i == 0 && Character.isUpperCase(word.charAt(i)) ) myCase = 1;
            if(i == 1 && myCase == 1 && Character.isUpperCase(word.charAt(i))) myCase = 2;
            
            if(i > 0 && myCase == 0 && Character.isUpperCase(word.charAt(i))) return false;
            if(i > 1 && myCase == 1 && Character.isUpperCase(word.charAt(i)) ) return false;
            if(i > 1 && myCase == 2 && Character.isLowerCase(word.charAt(i)) ) return false;
        }
        return true;
    }
}