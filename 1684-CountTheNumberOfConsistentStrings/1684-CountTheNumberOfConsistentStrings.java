// Last updated: 9/8/2026, 10:00:00 AM
class Solution {
    public int countConsistentStrings(String s, String[] arr) {
    boolean[] freq = new boolean[26];
    for(char ch:s.toCharArray()){
        freq[ch-'a']=true;
    } 
    int count=0;
    for(String word:arr){
        boolean ok = true; 
        for(char ch:word.toCharArray()){

        if(!freq[ch-'a']){
            ok=false;
            break;
        }
        }
        if(ok){
            count++;
        }
    } 
    return count;
    }
}