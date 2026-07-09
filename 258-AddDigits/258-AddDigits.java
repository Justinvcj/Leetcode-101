// Last updated: 7/9/2026, 9:16:09 AM
class Solution {
    public int addDigits(int num) {
    while(num >=10){
        num=getNext(num);

    } 
    return num;   
    }
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}