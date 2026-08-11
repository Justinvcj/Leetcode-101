// Last updated: 8/11/2026, 2:10:25 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
    int [] arr=new int[2*n];
    int index=0;

        for(int i=0;i<n;i++){
           arr[index]=nums[i];
           arr[index+1]=nums[n+i];
           index+=2;
        }
    
    return arr;  
    }
}