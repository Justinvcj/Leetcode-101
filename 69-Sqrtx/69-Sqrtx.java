// Last updated: 7/9/2026, 9:17:14 AM
class Solution {
    public int mySqrt(int x) {
       
    int low=0;
    int high=x;
    int ans=0;

    while(low<=high){
        int mid=(high+low)/2;
        long sq=(long)mid*mid;

        if(sq==x) return mid;

        if(sq<x){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    } 
    return ans;   
    }
}