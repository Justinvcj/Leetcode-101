// Last updated: 7/9/2026, 9:14:20 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full=numBottles;
        int totalDrank=full;
        while(full>=numExchange){
            int newFull=full/numExchange;
            int leftOver=full%numExchange;
            totalDrank+=newFull;
            full=newFull+leftOver;
        }
        return totalDrank;
    }
}