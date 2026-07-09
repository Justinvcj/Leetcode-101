// Last updated: 7/9/2026, 9:13:55 AM
import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long MOD = 1000000007L;
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                arr[i] = (long) nums[i] + d;
            } else {
                arr[i] = (long) nums[i] - d;
            }
        }

        Arrays.sort(arr);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + arr[i] * (2L * i - n + 1)) % MOD;
        }

        return (int) ((ans + MOD) % MOD); 
    }
}
