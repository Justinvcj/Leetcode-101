// Last updated: 8/11/2026, 2:09:37 PM
class Solution {
    public int minimumRecolors(String s, int k) {
    int count=0;
    int max=0;
    for(int i=0;i<k;i++){
        if(s.charAt(i)=='W'){
            count++;
        }
    }  
    max=count;
    for(int i=k;i<s.length();i++){
        if(s.charAt(i)=='W'){
            count++;
        }

        if(s.charAt(i-k)=='W'){
            count--;
        }
        max=Math.min(max,count);
    }
    return max; 
    }
}