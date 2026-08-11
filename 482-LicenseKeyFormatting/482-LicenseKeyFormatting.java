// Last updated: 8/11/2026, 3:42:18 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3    char [] arr=s.toCharArray();
4    int n=arr.length;
5    for(int start=0;start<n;start+=2*k){
6        int left=start;
7        int right=Math.min(start+k-1,n-1);
8        while (left < right) {
9                char temp = arr[left];
10                arr[left] = arr[right];
11                arr[right] = temp;
12                left++;
13                right--;
14            }
15    }   
16    return new String(arr);
17    }
18}