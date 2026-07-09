// Last updated: 7/9/2026, 9:14:54 AM
class Solution {
    public boolean rotateString(String s, String goal) {
    if(s.length() != goal.length()){
        return false;
    } 
    String dd=s+s;
    return dd.contains(goal);

    }
}