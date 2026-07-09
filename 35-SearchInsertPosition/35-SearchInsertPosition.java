// Last updated: 7/9/2026, 9:17:30 AM
class Solution {
    public int searchInsert(int[] arr, int target) {
    int i=0;
    int j=arr.length-1;
    while(i<=j){
        int mid=(i+j)/2;
        if(target==arr[mid]){
            return mid;
        }else if(arr[mid]<target){
            i=mid+1;
        }else{
            j=mid-1;
        }
    }
    return i;
    }
}