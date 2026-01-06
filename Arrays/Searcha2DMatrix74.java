public class Searcha2DMatrix74 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] matrix = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(sol.searchMatrix(matrix, target));
    }
}

// Example 1:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

class Solution {
    // ---------------------------------------------
    // Approach 1: Optimized Staircase Search
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