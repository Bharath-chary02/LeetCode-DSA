package Array;

// import java.util.*;

public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        int[][] matrix = {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
                };

        Solution sol = new Solution();
        sol.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

// Example 1:


// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

class Solution {
    public void setZeroes(int[][] matrix) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Store zero positions)
        // Time: O((n * m) + k * (n + m))
        // Space: O(k)
        /*
        List<int[]> zeros = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeros.add(new int[]{i, j});
                }
            }
        }

        for (int[] zero : zeros) {
            int x = zero[0], y = zero[1];

            for (int j = 0; j < m; j++) {
                matrix[x][j] = 0;
            }

            for (int i = 0; i < n; i++) {
                matrix[i][y] = 0;
            }
        }
        */

        
    }
}
