// Last updated: 7/27/2026, 12:12:39 PM
1class Solution {
2    public boolean canBeEqual(int[] target, int[] arr) {
3    int [] freq=new int[1001];
4    for(int x:target){
5        freq[x]++;
6    }
7    for(int x:arr){
8        freq[x]--;
9    }   
10    for(int x:freq){
11        if(x!=0){
12            return false;
13        }
14    } 
15    return true;
16    }
17}