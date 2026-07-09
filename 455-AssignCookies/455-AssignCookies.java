// Last updated: 7/9/2026, 9:15:24 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
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