// Last updated: 7/9/2026, 9:13:51 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int maxFreq = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
            }
            
        }

        visited = new boolean[nums.length]; 
        int total = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }if (count == maxFreq) {
                total += count; 
            }
            
        }

        return total;
    }
}
