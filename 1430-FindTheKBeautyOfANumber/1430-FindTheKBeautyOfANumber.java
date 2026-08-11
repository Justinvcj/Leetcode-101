// Last updated: 8/11/2026, 2:10:44 PM
class Solution {
    public int divisorSubstrings(int num, int k) {
    int count=0;
    String str = String.valueOf(num);
    for(int i=0;i<=str.length()-k;i++){
        String sub=str.substring(i,i+k);
        int val=Integer.parseInt(sub);

        if(val!=0 && num %val==0){
            count++;
        }
    }
    return count;
    }
}