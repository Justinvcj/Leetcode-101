// Last updated: 7/29/2026, 2:38:29 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3    int [] arr=new int[2*n];
4    int index=0;
5
6        for(int i=0;i<n;i++){
7           arr[index]=nums[i];
8           arr[index+1]=nums[n+i];
9           index+=2;
10        }
11    
12    return arr;  
13    }
14}