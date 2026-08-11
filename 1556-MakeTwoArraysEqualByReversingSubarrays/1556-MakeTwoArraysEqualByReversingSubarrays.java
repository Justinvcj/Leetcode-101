// Last updated: 8/11/2026, 2:10:32 PM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
    int [] freq=new int[1001];
    for(int x:target){
        freq[x]++;
    }
    for(int x:arr){
        freq[x]--;
    }   
    for(int x:freq){
        if(x!=0){
            return false;
        }
    } 
    return true;
    }
}