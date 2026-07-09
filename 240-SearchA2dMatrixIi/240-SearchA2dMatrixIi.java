// Last updated: 7/9/2026, 9:16:13 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==target){
                return true;
            }
        }
    }
    return false;   
    }
}