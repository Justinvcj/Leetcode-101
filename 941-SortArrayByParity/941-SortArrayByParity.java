// Last updated: 7/9/2026, 9:14:50 AM
class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int[] result = new int[arr.length];
        int idx = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) result[idx++] = num;
        }
        for (int num : arr) {
            if (num % 2 != 0) result[idx++] = num;
        }
        
        return result;
    }
}
