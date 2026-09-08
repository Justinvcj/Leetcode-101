// Last updated: 9/8/2026, 10:00:04 AM
class Solution {
    public String thousandSeparator(int n) {
    StringBuilder sb=new StringBuilder();
    String s=String.valueOf(n);
    int k=3;
    for(int i=s.length()-1;i>=0;i--){
        if(sb.length() > 0 && sb.length() % (k + 1) == k){
            sb.append(".");
        }
        sb.append(s.charAt(i));
    } 
    return sb.reverse().toString();   
    }
}