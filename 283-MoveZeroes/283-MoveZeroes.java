// Last updated: 9/9/2026, 12:34:29 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3    HashMap<String,List<String>>list=new HashMap<>();
4    for(String word:strs){
5    int [] freq=new int[26];
6    for(char ch:word.toCharArray()){
7        freq[ch-'a']++;
8    } 
9    StringBuilder sb=new StringBuilder();  
10    for(int count:freq){
11        sb.append(count).append("#");
12    }
13    list.putIfAbsent(sb.toString(),new ArrayList<>());
14    list.get(sb.toString()).add(word);
15    }
16    return new ArrayList<>(list.values());
17    }
18}