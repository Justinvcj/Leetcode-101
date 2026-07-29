// Last updated: 7/29/2026, 2:07:01 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3
4    HashSet<Integer>set=new HashSet<>();
5    for(int i=0;i<nums.length;i++){
6        if(set.contains(nums[i])){
7            return true;
8        }
9        set.add(nums[i]);
10
11        if(set.size()>k){
12            set.remove(nums[i-k]);
13        }
14    }
15    return false;   
16    }
17}