// Last updated: 7/9/2026, 9:15:53 AM
class Solution {
    public boolean isPerfectSquare(int x) {
        int low = 0;
        int high = x;
        int ans=0;
        while (low <= high) 
        {
            int mid=(low+high)/2;
            long sq=(long)mid*mid;
            if(sq==x) return true;

            if(sq<x)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(ans*ans == x){
            return true;
        }
        else{
            return false;
        }

    }
}