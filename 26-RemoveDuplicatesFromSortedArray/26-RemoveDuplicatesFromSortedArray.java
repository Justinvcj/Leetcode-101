// Last updated: 7/9/2026, 9:17:39 AM
class Solution {
    public int removeDuplicates(int[] nums) {
    int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            j++;
            nums[j]=nums[i];
        }
    } 
    return j+1;   
    }
}