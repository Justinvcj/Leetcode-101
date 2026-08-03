// Last updated: 8/3/2026, 12:21:59 PM
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3    int count=0;
4    String str = String.valueOf(num);
5    for(int i=0;i<=str.length()-k;i++){
6        String sub=str.substring(i,i+k);
7        int val=Integer.parseInt(sub);
8
9        if(val!=0 && num %val==0){
10            count++;
11        }
12    }
13    return count;
14    }
15}