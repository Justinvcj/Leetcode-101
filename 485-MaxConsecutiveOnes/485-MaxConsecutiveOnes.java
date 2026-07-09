// Last updated: 7/9/2026, 9:15:21 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count=0;
    int max=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
            if(count>max){
                max=count;
            }
        }else {
          
            count=0;
        }
    }
    return Math.max(max,count); 
    }
}