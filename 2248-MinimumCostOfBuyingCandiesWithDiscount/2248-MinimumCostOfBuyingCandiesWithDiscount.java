// Last updated: 7/9/2026, 9:13:59 AM
class Solution {
    public int minimumCost(int[] cost) {
    if(cost.length==1){
        return cost[0];
    }
    Arrays.sort(cost);

    int total=0;
    for(int i=cost.length-1;i>=0;i-=3){
        total+=cost[i];

        if(i-1>=0){
            total+=cost[i-1];
        }
    } 
    return total;   
    }
}