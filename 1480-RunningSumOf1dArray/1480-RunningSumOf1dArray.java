// Last updated: 9/8/2026, 10:00:22 AM
class Solution {
    public int[] runningSum(int[] nums) {

    for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
    }
    return nums;    
    }
}