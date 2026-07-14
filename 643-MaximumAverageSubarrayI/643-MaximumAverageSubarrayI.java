// Last updated: 7/14/2026, 11:31:36 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3    int maxsum=0;
4    int n=nums.length;
5    int sum=0;
6    for(int i=0;i<k;i++){
7        sum+=nums[i];
8    } 
9    maxsum=sum;
10    for(int i=1;i<n-k+1;i++){
11        sum=sum-nums[i-1]+nums[i+k-1];
12        maxsum=Math.max(maxsum,sum);
13    }   
14    return (double)maxsum/k;
15    }
16}