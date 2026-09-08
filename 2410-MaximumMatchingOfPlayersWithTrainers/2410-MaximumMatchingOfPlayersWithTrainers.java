// Last updated: 9/8/2026, 9:59:04 AM
class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
    int n=g.length;
    Arrays.sort(g);
    Arrays.sort(s);

    int i=0;
    int j=0;
    while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            i++;
        }
        j++;
        
    }
    return i;    
    }
}