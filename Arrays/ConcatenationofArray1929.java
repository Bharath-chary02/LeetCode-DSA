import java.util.*;

public class ConcatenationofArray1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.getConcatenation(nums)));
    }
}

// Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

class Solution {
    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(n)
    // Space: O(n)
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            newArr[i] = nums[i];
        }

        int j = 0;
        for(int i = n; i < n * 2; i++) {
            newArr[i] = nums[j];
            j++;
        }

        return newArr;
    }
}