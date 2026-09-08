// Last updated: 9/8/2026, 9:58:26 AM
class Solution {
    public int numberOfSpecialChars(String word) {

    boolean [] seen=new boolean[128];
    for(int i=0;i<word.length();i++){
        seen[word.charAt(i)]=true;
    }   
    int spl=0;
    for(char ch='a';ch<='z';ch++){
        if(seen[ch-32]&&seen[ch]){
            spl++;
        }
    }
    return spl;
    }
}