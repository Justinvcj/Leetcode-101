// Last updated: 7/28/2026, 2:04:38 PM
1class Solution {
2    public int minimumRecolors(String s, int k) {
3    int count=0;
4    int max=0;
5    int black=0;
6    for(int i=0;i<k;i++){
7        if(s.charAt(i)=='W'){
8            count++;
9        }
10    }  
11    max=count;
12    for(int i=k;i<s.length();i++){
13        if(s.charAt(i)=='W'){
14            count++;
15        }
16
17        if(s.charAt(i-k)=='W'){
18            count--;
19        }
20        max=Math.min(max,count);
21    }
22    return max; 
23    }
24}