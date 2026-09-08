// Last updated: 9/8/2026, 10:01:40 AM
class Solution {
    public boolean isMonotonic(int[] arr) {
    int n=arr.length;
    boolean increasing=true;
    boolean decreasing =true;
    for(int i=1;i<n;i++){
        if(arr[i] > arr[i-1]){
            increasing =false;
        }

        if(arr[i] < arr[i-1]){
            decreasing =false;
        }
    }
        return increasing||decreasing;
    }
}