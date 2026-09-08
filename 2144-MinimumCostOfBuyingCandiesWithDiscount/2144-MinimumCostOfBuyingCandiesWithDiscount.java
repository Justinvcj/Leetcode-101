// Last updated: 9/8/2026, 9:59:23 AM
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