// Last updated: 7/9/2026, 9:14:02 AM
class Solution {
    public long getDescentPeriods(int[] prices) {
    long ans=1;
    long count=1;
    for(int i=1;i<prices.length;i++){
        if(prices[i-1]-prices[i]==1){
            count++;
        }else{
            count=1;
        }
        ans+=count;
    }
    return ans;
    }
}