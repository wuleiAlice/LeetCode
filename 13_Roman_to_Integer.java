/*
 Author:     Alice, Du Weichao
 Date:       11 Mar 2017
 Problem:    Roman to Integer
 Difficulty: Easy
 Source:	 https://leetcode.com/problems/roman-to-integer/#/description

 Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

public class Solution {
    public int romanToInt(String s) {
        String inverseStr = new StringBuilder(s).reverse().toString();
        int result = 0;
        int[] myArray = new int[s.length()];
        for(int i = 0; i < s.length() ; i ++){
            myArray[i] = value(s.charAt(i));
            result += myArray[i];
            if(i > 0 && myArray[i - 1] < myArray[i]) result -= 2 * myArray[i - 1];
        }
        return result;
    }
    
    
    public int value(char c){
        int result = 0;
        switch (c){
            case 'O': result = 0; break;
            case 'I': result = 1; break;
            case 'V': result = 5; break;
            case 'X': result = 10; break;
            case 'L': result = 50; break;
            case 'C': result = 100; break;
            case 'D': result = 500; break;
            case 'M': result = 1000; break;
        }
        return result;
    }
}