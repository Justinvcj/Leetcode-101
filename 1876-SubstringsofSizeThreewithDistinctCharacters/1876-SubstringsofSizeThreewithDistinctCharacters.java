// Last updated: 7/28/2026, 2:58:15 PM
1class Solution {
2    public int countGoodSubstrings(String s) {
3    int count=0;
4
5    for(int i=0;i<=s.length()-3;i++){
6        if(s.charAt(i) != s.charAt(i+1) &&
7            s.charAt(i) != s.charAt(i+2) &&
8            s.charAt(i+1) != s.charAt(i+2)){
9
10    count++;
11            }
12    }
13     return count;  
14    }
15}