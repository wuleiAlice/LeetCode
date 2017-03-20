/*
 Author:     Alice, Du Weichao
 Date:       07 Feb 2017
 Problem:    Keyboard Row
 Difficulty: Easy
 Source:     https://leetcode.com/problems/keyboard-row/
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/


public class Solution {
    public String[] findWords(String[] words) {
        String[] result = new String[words.length];
        String[] myLines =  {"qwertyuiopQWERTYUIOP", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm"};
        int currentLine = 5;
        int index = 0;
        for(int i = 0; i < words.length; i ++){
            currentLine = 5;
            search: {
                for(int j = 0; j < words[i].length(); j++){
                    for(int k = 0; k < 3; k ++){
                        for(int w = 0; w < myLines[k].length(); w ++) if(myLines[k].charAt(w) == words[i].charAt(j)) {
                            if(currentLine == 5)    currentLine = k;
                            else if(currentLine != k) break search;
                        }
                    }
                }
                result[index] = words[i];
                index++;
            }
        }
        String[] finalResult = new String[index];
        for(int i = 0; i < index; i ++)
            finalResult[i] = result[i];
        return finalResult;
    }
}