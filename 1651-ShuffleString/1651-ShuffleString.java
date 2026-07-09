// Last updated: 7/9/2026, 9:14:18 AM
class Solution {
    public String restoreString(String s, int[] arr) {
    char [] result=new char[s.length()];

    for(int i=0;i<s.length();i++){
        result[arr[i]]=s.charAt(i);
    } 
    return new String(result);   
    }
}