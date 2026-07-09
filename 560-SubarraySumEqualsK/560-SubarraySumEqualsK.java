// Last updated: 7/9/2026, 9:15:13 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer>map=new HashMap<>();
    int count=0;
    map.put(0,1);
    int prefix=0;
    for(int num:nums){
        prefix+=num;
    count+=map.getOrDefault(prefix-k,0);
    map.put(prefix,map.getOrDefault(prefix,0)+1);
    }
    return count;
    }
}