// Last updated: 7/9/2026, 9:14:46 AM
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
     int a=0;
     int b=1;
     for(int i=0;i<n;i++){
        int c=a+b;
        a=b;
        b=c;
     }   
    
    return a;
    }
    
}