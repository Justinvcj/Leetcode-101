// Last updated: 7/27/2026, 1:39:03 PM
1class Solution {
2    public int countConsistentStrings(String s, String[] arr) {
3    List<Character>list=new ArrayList<>();
4    for(char ch:s.toCharArray()){
5        list.add(ch);
6    } 
7    int count=0;
8    for(String word:arr){
9        boolean ok = true; 
10        for(char ch:word.toCharArray()){
11
12        if(!list.contains(ch)){
13            ok=false;
14            break;
15        }
16        }
17        if(ok){
18            count++;
19        }
20    } 
21    return count;
22    }
23}