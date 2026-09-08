// Last updated: 9/8/2026, 9:59:25 AM
class Solution {
    public int finalValueAfterOperations(String[] arr) {
    int x=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i].equals("X++") || arr[i].equals("++X")){
            x+=1;
        }else if(arr[i].equals("X--") || arr[i].equals("--X")){
            x-=1;
        }
    } 
    return x;   
    }
}