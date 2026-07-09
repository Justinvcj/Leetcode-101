// Last updated: 7/9/2026, 9:14:07 AM
class Solution {
    public int[] findPeakGrid(int[][] arr) {
    int n=arr.length;
    int m=arr[0].length;
    int left=0;
    int right=m-1;

    while(left<=right){
        int mid=left+(right-left)/2;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[max][mid]<arr[i][mid]){
                max=i;
            }
        }
        if((mid==0 || arr[max][mid] > arr[max][mid-1])&&
        (mid==m-1 || arr[max][mid] > arr[max][mid+1])){
            return new int[] {max,mid};
        }else if(mid >0 && arr[max][mid-1] > arr[max][mid] ){
            right=mid-1;
        }else{
            left=mid+1;
        }
    } return new int[] {-1,-1};
    }
}