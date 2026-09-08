// Last updated: 9/8/2026, 10:01:14 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalSize += nums[i]; 
        }
        
        int[] result = new int[totalSize];
        int idx = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            
            for (int j = 0; j < freq; j++) {
                result[idx++] = val;
            }
        }
        
        return result;
    }
}
