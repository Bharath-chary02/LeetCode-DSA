public class CheckKnightTourConfiguration2596 {
    public static void main(String[] args) {

        int[][] grid = {
            {0,11,16,5,20},
            {17,4,19,10,15},
            {12,1,8,21,6},
            {3,18,23,14,9},
            {24,13,2,7,22}
        };

        Solution obj = new Solution();
        System.out.println(obj.checkValidGrid(grid)); // true
    }
}

// Example 1:

// Input: grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
// Output: true
// Explanation: The above diagram represents the grid. It can be shown that it is a valid configuration.

class Solution {

    // ---------------------------------------------
    // Approach 1: Recursive Validation
    // Time: O(n^2)
    // Space: O(n^2) recursion stack

    public static boolean helper(int[][] grid, int row, int col, int moves, int n) {
        if(row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != moves) {
            return false;
        }

        if(moves == n * n - 1) {
            return true;
        }

        boolean ans1 = helper(grid, row - 2, col - 1, moves + 1, n);
        boolean ans2 = helper(grid, row - 2, col + 1, moves + 1, n);
        boolean ans3 = helper(grid, row - 1, col - 2, moves + 1, n);
        boolean ans4 = helper(grid, row - 1, col + 2, moves + 1, n);
        boolean ans5 = helper(grid, row + 1, col - 2, moves + 1, n);
        boolean ans6 = helper(grid, row + 1, col + 2, moves + 1, n);
        boolean ans7 = helper(grid, row + 2, col - 1, moves + 1, n);
        boolean ans8 = helper(grid, row + 2, col + 1, moves + 1, n); 

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;       
    }

    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        return helper(grid, 0, 0, 0, n);
    }
}