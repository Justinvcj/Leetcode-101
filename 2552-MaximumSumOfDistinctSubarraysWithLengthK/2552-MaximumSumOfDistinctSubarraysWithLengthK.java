// Last updated: 8/11/2026, 2:09:30 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    long sum=0;
    long max=0;
    HashMap<Integer,Integer>map=new HashMap<>();

    for(int i=0;i<k;i++){
        sum+=nums[i];
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    if(map.size()==k){

    max=sum;
    }
    
    for(int i=k;i<nums.length;i++){
        sum+=nums[i];
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        sum-=nums[i-k];
        map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);

        if(map.get(nums[i-k])==0){
            map.remove(nums[i-k]);
        }

        if (map.size() == k){
                max = Math.max(max, sum);
        }
    }

    return max;
    }
}