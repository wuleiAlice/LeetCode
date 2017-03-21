/*
 Author:     Alice, Du Weichao
 Date:       11 Mar 2017
 Problem:    Binary Watch
 Difficulty: Easy
 Source:     https://leetcode.com/problems/binary-watch/#/description

 A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.


For example, the above binary watch reads "3:25".

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

Example:

Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
Note:
The order of output does not matter.
The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".

*/


public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> myList = new LinkedList<String>();
        for(int i = 0; i <= num; i ++){
     //       if(i > 3) break;
      //      if(num - i > 5) break;
            myList.addAll(mixStr(readHour(i), readMinute(num - i)));
        }
        
     
        return myList;
    }
    
    public List<String> readHour(int num){
        List<String> result = new LinkedList<String>();
        int[] digits = new int[]{1, 2, 4, 8};
        
        if(num == 0) result.add("0");
        if(num == 1) 
            for(int i = 0; i < 4; i ++) result.add(Integer.toString(digits[i]));
        
        
        if(num == 2) 
            for(int i = 0; i < 3; i ++) 
                for(int j = i + 1; j < 4; j ++)
                    if(digits[i] + digits[j] < 12)  result.add(Integer.toString(digits[i] + digits[j]));

        if(num == 3) 
            for(int i = 0; i < 4; i ++)
                if(15 - digits[i] < 12)
                    result.add(Integer.toString(15 - digits[i]));
        
        return result;
    }
    
    
    public List<String> readMinute(int num){
        List<String> result = new LinkedList<String>();
        int[] digits = new int[]{1, 2, 4, 8, 16, 32};
        int temp;
        if(num == 0) result.add("00");
        else if(num == 1) 
            for(int i = 0; i < 6; i ++){ 
                temp = digits[i];
                result.add(addZero(temp));
            }
        
        else if(num == 2) 
            for(int i = 0; i < 5; i ++) 
                for(int j = i + 1; j < 6; j ++){
                    temp = digits[i] + digits[j];
                       result.add(addZero(temp));
                }
  
        else if(num == 3) 
             for(int i = 0; i < 4; i ++) 
                for(int j = i + 1; j < 5; j ++)
                    for(int k = j + 1; k < 6; k ++){
                        temp = digits[k] + digits[j] + digits[i];
                        if(temp < 60)
                            result.add(addZero(temp));
                    }
                    
        else if(num == 4) 
            for(int i = 0; i < 5; i ++) 
                for(int j = i + 1; j < 6; j ++){
                    temp = digits[i] + digits[j];
                    if(temp > 3)    result.add(addZero(63 - temp));
                }
                
        else if(num == 5) 
             for(int i = 0; i < 6; i ++){ 
                temp = digits[i];
                if(temp > 3)    result.add(addZero(63 - temp));
            }
          
        return result;
    }
    
    public String addZero(int num){
        if(num < 10) return "0" + Integer.toString(num);
        else return Integer.toString(num);
    }
    
    public List<String> mixStr(List<String> hour, List<String> min){
        List<String> result = new LinkedList<String>();
        for(String h : hour)
            for(String m: min)
                result.add(h + ":" + m);
                
        return result;
    }
}