import java.util.Arrays;

public class SudokuSolver37 {
    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Solution obj = new Solution();
        obj.solveSudoku(board);

        // Print solved board
        for(char[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }
}

// Example 1:


// Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
// Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
// Explanation: The input board is shown above and the only valid solution is shown below:

class Solution {

    public static boolean isSafe(char[][] board, int row, int col, char val) {
        for(int j = 0; j < 9; j++) {
            if(board[row][j] == val) {
                return false;
            }
        }

        for(int i = 0; i < 9; i++) {
            if(board[i][col] == val) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int i = startRow; i <= startRow + 2; i++) {
            for(int j = startCol; j <= startCol + 2; j++) {
                if(board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if(row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if(nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for(char val = '1'; val <= '9'; val++) {
            if(isSafe(board, row, col, val)) {
                board[row][col] = val;
                if(helper(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {

        // ---------------------------------------------
        // Approach: Backtracking
        // Time Complexity: Exponential (≈ O(9^(N*N)))
        // Space Complexity: O(N*N) recursion stack

        helper(board, 0, 0);
    }
}