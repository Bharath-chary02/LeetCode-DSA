
import java.util.*;

public class SpiralMatrix54 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(sol.spiralOrder(matrix1));
    }
}

// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

class Solution {

    // ---------------------------------------------
    // Approach: Boundary Traversal (Spiral)
    // Time: O(m * n)
    // Space: O(1) extra (excluding result list)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            for(int i = startCol; i <= endCol; i++) {
                res.add(matrix[startRow][i]);
            }

            for(int i = startRow + 1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }

            if(startRow < endRow) {
                for(int i = endCol - 1; i >= startCol; i--) {
                    res.add(matrix[endRow][i]);
                }
            }

            if(startCol < endCol) {
                for(int i = endRow - 1; i >= startRow + 1; i--) {
                    res.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return res;
    }
}