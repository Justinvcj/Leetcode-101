// Last updated: 8/11/2026, 2:54:12 PM
1class Solution {
2    public String[] divideString(String s, int k, char fill) {
3    int n=s.length();
4    StringBuilder sb=new StringBuilder();
5    int x=n%k;
6    int y=0;
7    if(x!=0){
8        y=k-x;
9        for(int i=0;i<y;i++){
10            sb.append(fill);
11        }
12    } 
13    for(int i=s.length()-1;i>=0;i--){
14        sb.append(s.charAt(i));
15    } 
16    String full=sb.reverse().toString();
17    int num = full.length() / k;
18    String[] result = new String[num];
19
20    for(int i=0;i<num;i++){
21        result[i]=full.substring(i * k, (i + 1) * k);
22    }
23    return result;
24    }
25}