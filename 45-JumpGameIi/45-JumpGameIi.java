// Last updated: 7/9/2026, 9:17:29 AM
class Solution {
    public int jump(int[] nums) {
    int end=0;
    int far=0;
    int count=0;

    for(int i=0;i<nums.length-1;i++){
        far=Math.max(far,i+nums[i]);

        if(i==end){
            count++;
            end=far;
        }
    } 
    return count;  
    }
}