// Last updated: 8/11/2026, 2:16:51 PM
1class Solution {
2    public String thousandSeparator(int n) {
3    StringBuilder sb=new StringBuilder();
4    String s=String.valueOf(n);
5    int k=3;
6    for(int i=s.length()-1;i>=0;i--){
7        if(sb.length() > 0 && sb.length() % (k + 1) == k){
8            sb.append(".");
9        }
10        sb.append(s.charAt(i));
11    } 
12    return sb.reverse().toString();   
13    }
14}