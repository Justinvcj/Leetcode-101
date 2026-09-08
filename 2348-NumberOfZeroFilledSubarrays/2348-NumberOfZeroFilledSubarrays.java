// Last updated: 9/8/2026, 9:59:07 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {

    long count=0;
    long sum=0;
    for(int num:nums){
        if(num==0){
            count++;
            sum+=count;
        }else{
            count=0;
        }
    }  
    return sum; 
    }
}