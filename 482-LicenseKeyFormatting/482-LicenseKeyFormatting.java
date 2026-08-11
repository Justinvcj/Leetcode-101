// Last updated: 8/11/2026, 2:07:47 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3    String st=s.replaceAll("-","").toUpperCase();
4    StringBuilder sb=new StringBuilder();
5    for(int i=st.length()-1;i>=0;i--){
6        char ch=st.charAt(i);
7        if(sb.length() > 0 && sb.length() % (k + 1) == k){
8            sb.append("-");
9            
10        }
11        sb.append(ch);
12    }
13    return sb.reverse().toString();
14    }
15}