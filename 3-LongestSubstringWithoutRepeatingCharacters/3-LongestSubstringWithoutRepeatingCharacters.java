// Last updated: 7/14/2026, 12:04:01 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3    HashMap<Character,Integer>map=new HashMap<>();
4    int left=0;
5    int maxLen=0;
6    for(int right=0;right<s.length();right++){
7        char rightchar=s.charAt(right);
8
9        if(map.containsKey(rightchar)){
10            left=Math.max(left,map.get(rightchar)+1);
11        }
12        map.put(rightchar,right);
13        maxLen=Math.max(maxLen,right-left+1);
14    }  
15    return maxLen; 
16    }
17}