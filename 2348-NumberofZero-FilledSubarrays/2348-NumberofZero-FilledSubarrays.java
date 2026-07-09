// Last updated: 7/9/2026, 12:02:18 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3    int profit=0;
4
5    for(int i=1;i<prices.length;i++)
6    {
7       if(prices[i]>prices[i-1]){
8        profit+=prices[i]-prices[i-1];
9       } 
10
11    }  
12    return profit; 
13    }
14}