// Last updated: 7/9/2026, 9:17:23 AM
class Solution {
    public int maxSubArray(int[] arr) {
    int n =arr.length;
        int maxSum=arr[0];
        int currSum=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i] > currSum+arr[i]){
                currSum=arr[i];
            }
            else{
                currSum=currSum+arr[i];
            }
            if(currSum> maxSum){
            maxSum=currSum;
            }
        }
        return maxSum;   
    }
}