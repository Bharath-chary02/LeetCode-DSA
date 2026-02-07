
import java.util.Arrays;

public class FindMissingandRepeatedValues2965 {
    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.findMissingAndRepeatedValues(grid)));
    }
}

// Example 1:

// Input: grid = [[1,3],[2,2]]
// Output: [2,4]
// Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        int[] res = new int[2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                freq[grid[i][j]]++;
            }
        }

        for(int i = 1; i <= n * n; i++){
            if(freq[i] == 2){
                res[0] = i;
            }
            if(freq[i] == 0){
                res[1] = i;
            }
        }

        return res;
    }
}