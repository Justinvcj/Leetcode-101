// Last updated: 9/8/2026, 10:01:59 AM
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
    int left=0;
    int right=arr.length-1;
    while(left <=right){
        int mid=(left+right)/2;
        if(arr[mid]<=target){
            left=mid+1; 
        }else{
            right=mid-1;
        }
    }
    return arr[left % arr.length];
    }
}