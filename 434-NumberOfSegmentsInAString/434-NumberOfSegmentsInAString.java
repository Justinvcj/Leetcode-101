// Last updated: 7/9/2026, 9:15:49 AM
class Solution {
    public int countSegments(String s) {
        s = s.trim(); 
        if (s.equals("")) return 0;

        String[] arr = s.split("\\s+"); 
        return arr.length;
    }
}
