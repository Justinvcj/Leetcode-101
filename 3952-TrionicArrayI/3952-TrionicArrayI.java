// Last updated: 7/9/2026, 9:13:45 AM
class Solution {
    public boolean isTrionic(int[] nums) {
    int n=nums.length;
    if(nums[0]>=nums[1]){
        return false;
    }
    int count=1;
    for(int i=2;i<n;i++){
        if(nums[i-1]==nums[i]){
            return false;
        }
        if((nums[i-2]-nums[i-1])*(nums[i-1]-nums[i])<0){
            count++;
        }
    }
    return count==3;
    }
}