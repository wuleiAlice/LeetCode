/*
 Author:     Alice, Du Weichao
 Date:       24 Jan 2017
 Problem:    Add Digits
 Difficulty: Easy
 Source:     https://leetcode.com/problems/add-digits/
 Notes:
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/



public class Solution {
    public int addDigits(int num) {
       
        if(num < 10) return num;
        
        else{
             
             int newNum = temp(num);
             return addDigits(newNum);
        } 
    }
    public int temp(int num){
        int result = 0;
        while(num >= 1){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}

/*********** Top Solution ***********
public class Solution {

    public int addDigits(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }

}
*/