// Last updated: 9/8/2026, 10:01:37 AM
class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int evenIndex = 0, oddIndex = 1;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        
        return result;
    }
}
