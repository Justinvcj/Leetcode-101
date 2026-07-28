// Last updated: 7/28/2026, 2:39:03 PM
1class Solution {
2    public int minimumRecolors(String s, int k) {
3    int count=0;
4    int max=0;
5    for(int i=0;i<k;i++){
6        if(s.charAt(i)=='W'){
7            count++;
8        }
9    }  
10    max=count;
11    for(int i=k;i<s.length();i++){
12        if(s.charAt(i)=='W'){
13            count++;
14        }
15
16        if(s.charAt(i-k)=='W'){
17            count--;
18        }
19        max=Math.min(max,count);
20    }
21    return max; 
22    }
23}