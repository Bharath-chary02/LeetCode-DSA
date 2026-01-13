package Array;

public class WordSearch79 {
    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        Solution sol = new Solution();
        boolean ans = sol.exist(board, word);

        System.out.println("Word Found? " + ans);
    }
}

// Example 1:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true

class Solution {
    static int[] r = {-1, 1, 0, 0};
    static int[] c = {0, 0, -1, 1};

    // -------------------------------------------------
    // Approach 1: Using visited[][] (Backtracking)
    // Time: O(n*m*4^L)
    // Space: O(n*m) + recursion stack

    // public static boolean helper(int row, int col, int n, int m, char[][] board, int index, int size, boolean[][] visited, String word) {
    //     if(index == size) {
    //         return true;
    //     }
    //     visited[row][col] = true;

    //     for(int i = 0; i < 4; i++) {
    //         int ur = row + r[i];
    //         int uc = col + c[i];
    //         if(ur >= 0 && ur < n && uc >= 0 && uc < m && !visited[ur][uc]) {
    //             if(board[ur][uc] == word.charAt(index)) {
    //                 if(helper(ur, uc, n, m, board, index + 1, size, visited, word)) {
    //                     return true;
    //                 }
    //             }
    //         }
    //     }

    //     visited[row][col] = false;
    //     return false;
    // }

    // public boolean exist(char[][] board, String word) {
    //     int n = board.length;
    //     int m = board[0].length;
    //     int size = word.length();
    //     boolean[][] visited = new boolean[n][m];

    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {
    //             if(board[i][j] == word.charAt(0)) {
    //                 if(helper(i, j, n, m, board, 1, size, visited, word)) {
    //                     return true;
    //                 }
    //             }
    //         }
    //     }
    //     return false;
    // }

    // -------------------------------------------------
    // Approach 2: Marking directly on board (Optimized Space)
    // Time: O(n*m*4^L)
    // Space: O(L) recursion stack

    public static boolean helper(int row, int col, int n, int m, char[][] board, int index, int size, String word) {
        if(index == size) {
            return true;
        }
        char ch = board[row][col];
        board[row][col] = '$';

        for(int i = 0; i < 4; i++) {
            int ur = row + r[i];
            int uc = col + c[i];
            if(ur >= 0 && ur < n && uc >= 0 && uc < m) {
                if(board[ur][uc] == word.charAt(index)) {
                    if(helper(ur, uc, n, m, board, index + 1, size, word)) {
                        return true;
                    }
                }
            }
        }

        board[row][col] = ch;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int size = word.length();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(helper(i, j, n, m, board, 1, size, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}