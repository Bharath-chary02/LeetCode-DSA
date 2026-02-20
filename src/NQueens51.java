import java.util.*;

public class NQueens51 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> result = sol.solveNQueens(4);
        System.out.println(result);
    }
}

// Example 1:

// Input: n = 4
// Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
// Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

class Solution {

    public static boolean isSafe(int n, int r, int c, char[][] queen) {
        for(int i = 0; i < r; i++) {
            if(queen[i][c] == 'Q') {
                return false;
            }
        }

        for(int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if(queen[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if(queen[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(int n, int i, char[][] queen, List<List<String>> ans) {
        if(i == n) {
            List<String> board = new ArrayList<>();
            for(int a = 0; a < n; a++) {
                board.add(new String(queen[a]));
            }
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int j = 0; j < n; j++) {
            if(isSafe(n, i, j, queen)) {
                queen[i][j] = 'Q';
                nQueens(n, i + 1, queen, ans);
                queen[i][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        // ---------------------------------------------
        // Approach 1: Backtracking
        // Time: O(N!)
        // Space: O(N^2) (Board) + O(N) recursion stack

        char[][] queen = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            Arrays.fill(queen[i], '.');
        }


        nQueens(n, 0, queen, ans);

        return ans;
    }
}