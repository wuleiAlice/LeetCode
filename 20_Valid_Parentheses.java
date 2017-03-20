/*
 Author:     Alice, Du Weichao
 Date:       17 Mar 2017
 Problem:    Valid Parentheses
 Difficulty: Easy
 Source:     https://leetcode.com/problems/valid-parentheses/#/description


Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/




public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> myStack = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') 
                myStack.add(s.charAt(i));
            else  if(myStack.size() == 0) return false;
            else if(s.charAt(i) == ')') {
                if(myStack.getLast() == '(') myStack.removeLast();
                else return false;
            }
            else if(s.charAt(i) == '}') {
                if(myStack.getLast() == '{') myStack.removeLast();
                else return false;
            }
             else  {
                if(myStack.getLast() == '[') myStack.removeLast();
                else return false;
            }
        }
        
        if(myStack.size() == 0) return true;
        else return false;
    }
}