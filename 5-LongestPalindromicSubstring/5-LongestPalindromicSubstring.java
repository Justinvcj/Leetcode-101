// Last updated: 7/9/2026, 9:17:53 AM
class Solution {
    public boolean isPalin(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String str = s.substring(i, j);
                if (isPalin(str) && str.length() > longest.length()) {
                    longest = str;
                }
            }
        }
        return longest;
    }
}
