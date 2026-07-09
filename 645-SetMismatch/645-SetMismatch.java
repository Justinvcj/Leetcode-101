// Last updated: 7/9/2026, 9:15:09 AM
import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int dup = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) dup = nums[i];
        }
        int expected = 1;
        int missing = -1;
        for (int num : nums) {
            if (num == expected) expected++;
            else if (num > expected) {
                missing = expected;
                break;
            }
        }
        if (missing == -1) missing = expected;
        return new int[]{dup, missing};
    }
}
