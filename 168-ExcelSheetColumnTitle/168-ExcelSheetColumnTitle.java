// Last updated: 7/9/2026, 9:16:37 AM
class Solution {
    public String convertToTitle(int n) {
    StringBuilder sb=new StringBuilder();
    while(n>0){
    n--;
    char letter=(char)('A'+n%26);    
    sb.append(letter);
    n=n/26;
    }
    return sb.reverse().toString();
    }
    
}