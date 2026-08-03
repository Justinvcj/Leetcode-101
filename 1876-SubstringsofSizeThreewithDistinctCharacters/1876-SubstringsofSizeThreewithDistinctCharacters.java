// Last updated: 8/3/2026, 2:38:04 PM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3    long sum=0;
4    long max=0;
5    HashMap<Integer,Integer>map=new HashMap<>();
6
7    for(int i=0;i<k;i++){
8        sum+=nums[i];
9        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
10    }
11    if(map.size()==k){
12
13    max=sum;
14    }
15    
16    for(int i=k;i<nums.length;i++){
17        sum+=nums[i];
18        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
19
20        sum-=nums[i-k];
21        map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
22
23        if(map.get(nums[i-k])==0){
24            map.remove(nums[i-k]);
25        }
26
27        if (map.size() == k){
28                max = Math.max(max, sum);
29        }
30    }
31
32    return max;
33    }
34}