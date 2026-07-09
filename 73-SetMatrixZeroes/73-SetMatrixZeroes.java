// Last updated: 7/9/2026, 9:17:12 AM
import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int r : zeroRows) {
            for (int j = 0; j < m; j++) {
                matrix[r][j] = 0;
            }
        }

        for (int c : zeroCols) {
            for (int i = 0; i < n; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}
