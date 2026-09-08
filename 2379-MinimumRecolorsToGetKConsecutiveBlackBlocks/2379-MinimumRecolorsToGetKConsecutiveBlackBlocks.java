// Last updated: 9/8/2026, 9:59:05 AM
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