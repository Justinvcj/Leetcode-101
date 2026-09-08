// Last updated: 9/8/2026, 10:00:19 AM
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