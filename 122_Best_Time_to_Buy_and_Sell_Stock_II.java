/*
 Author:     Alice, Du Weichao
 Date:       20 Mar 2017
 Problem:    Best Time to Buy and Sell Stock II
 Difficulty: Easy
 Source:     https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/#/description

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

*/


public class Solution {
    public int maxProfit(int[] prices) {
        LinkedList<Integer> p = new LinkedList<Integer>();
        LinkedList<Integer> v = new LinkedList<Integer>();
        int firstV = 0;
        int profit = 0;
     
        for(int i = 0; i < prices.length - 1; i++){
          
          if(i == 0 && prices[1] > prices[0]){
              v.add(i);
                profit -= prices[i];
          }
           if(i > 0 && prices[i - 1] <prices[i] &&  prices[i] >= prices[i + 1]) //peak
                {
                    p.add(i);
                    profit += prices[i];
                }
                
    
            else if(i > 0 && prices[i - 1] >= prices[i] && prices[i] < prices[i + 1]) //v
            {
                v.add(i);
                profit -= prices[i];
            }
        }
        
        if(prices.length < 2) return 0;
        if(prices.length == 2 && prices[1] > prices[0]) return prices[1] - prices[0]; 
        if(prices.length >= 3 && prices[prices.length - 2] < prices[prices.length - 1]  )profit += prices[prices.length - 1];
        return profit;
        
    }
}