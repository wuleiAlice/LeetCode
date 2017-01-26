/*
 Author:     Alice, Du Weichao
 Date:       26 Jan 2017
 Problem:    Ransom Note
 Difficulty: Easy
 Source:     https://leetcode.com/problems/ransom-note/
 Notes:
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] tempMag= new int[magazine.length()];
        int[] tempNote = new int[ransomNote.length()];
        int sum = 0;
        for(int i = 0; i < ransomNote.length(); i++){
             for(int j = 0; j < magazine.length(); j++){
                if(ransomNote.charAt(i) == magazine.charAt(j) && tempMag[j] == 0) 
                {
                    tempMag[j] = 1;
                    sum ++;
                    break;
                }
            }
        }
        return sum == ransomNote.length();
    }
}