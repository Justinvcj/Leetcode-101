// Last updated: 7/9/2026, 9:14:45 AM
class Solution {
    public int[] sortedSquares(int[] nums) {

    int n=nums.length;
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=nums[i]*nums[i];
    }
    Arrays.sort(arr);

    return arr;   
    }
}