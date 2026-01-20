package Array;

public class Searcha2DMatrixII240 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 5;

        Solution obj = new Solution();
        System.out.println(obj.searchMatrix(matrix, target)); // true
    }
}

// Example 1:

// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true

class Solution {
    // ---------------------------------------------
    // Approach: Top-Right Corner Search (Optimal)
    // Time: O(m + n)
    // Space: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(target == matrix[row][col]) {
                    return true;
                }
                if(target < matrix[row][col]) {
                    col--;
                } else {
                    row++;
                }
        }
        return false;
    }
}