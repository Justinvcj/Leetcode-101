// Last updated: 7/17/2026, 12:28:28 PM
class Solution {
    public int[] numberOfPairs(int[] nums) {
    int [] freq=new int[101];
    int pairs=0;
    for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
        if(freq[nums[i]]==2){
            pairs++;
            freq[nums[i]]=0;
        }
    }
    int sum=0;
    for(int x:freq){
        sum+=x;
    } 
    return new int[]{pairs,sum};   
    }
}