// Last updated: 9/8/2026, 9:58:25 AM
class Solution {
    public long countAlternatingSubarrays(int[] nums) {
    long ans=1;
    long count=1;  

    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            count++;

        }else{
            count=1;
        }
        ans+=count;
    } 
    return ans;
    }
}