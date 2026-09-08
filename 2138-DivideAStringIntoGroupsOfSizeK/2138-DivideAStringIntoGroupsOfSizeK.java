// Last updated: 9/8/2026, 9:59:21 AM
class Solution {
    public String[] divideString(String s, int k, char fill) {
    int n=s.length();
    StringBuilder sb=new StringBuilder();
    int x=n%k;
    int y=0;
    if(x!=0){
        y=k-x;
        for(int i=0;i<y;i++){
            sb.append(fill);
        }
    } 
    for(int i=s.length()-1;i>=0;i--){
        sb.append(s.charAt(i));
    } 
    String full=sb.reverse().toString();
    int num = full.length() / k;
    String[] result = new String[num];

    for(int i=0;i<num;i++){
        result[i]=full.substring(i * k, (i + 1) * k);
    }
    return result;
    }
}