// Last updated: 7/9/2026, 9:17:05 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            count++;
        }
    } 
    return count >=1;   
    }
}