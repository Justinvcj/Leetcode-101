// Last updated: 9/8/2026, 10:01:55 AM
class Solution {
    public boolean rotateString(String s, String goal) {
    if(s.length() != goal.length()){
        return false;
    } 
    String dd=s+s;
    return dd.contains(goal);

    }
}