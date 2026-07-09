// Last updated: 7/9/2026, 9:14:14 AM
class Solution {
    public int maximumWealth(int[][] arr) {
    int max=0;
    int n=arr.length;
    int m=arr[0].length;
    for (int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<m;j++){
           sum+=arr[i][j];
           max=Math.max(max,sum); 
        }
    }
    return max;
    }
}