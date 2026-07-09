// Last updated: 7/9/2026, 9:15:01 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
