// Last updated: 7/9/2026, 9:14:10 AM
class Solution {
    public int secondHighest(String s) {
    int first=-1;
    int second=-1;

    for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(Character.isDigit(c)){
        int digit=c-'0';

        if(digit>first){
            second=first;
            first=digit;
        }else if(digit>second && digit!= first){
            second=digit;
        }
    }   
    } 
    return second;   
    }
}