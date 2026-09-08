// Last updated: 9/8/2026, 10:01:00 AM
import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] freq = new int[n]; 
        int freqIndex = 0;
        int i = 0;

        while (i < n) {
            int count = 1;
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            freq[freqIndex++] = count;
            i++;
        }

        Arrays.sort(freq, 0, freqIndex); 
        for (int j = 1; j < freqIndex; j++) {
            if (freq[j] == freq[j - 1]) {
                return false;
            }
        }
        return true;
    }
}
