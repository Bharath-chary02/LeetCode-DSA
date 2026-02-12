import java.util.Arrays;

public class LeftandRightSumDifferences2574 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {10, 4, 8, 3};

        int[] result = sol.leftRightDifference(nums);

        System.out.println(Arrays.toString(result));
    }
}

// Example 1:

// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]
// Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
// The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

class Solution {
    public int[] leftRightDifference(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Prefix & Suffix Sum
        // Time: O(n)
        // Space: O(n)

        int n = nums.length;
        int[] ls = new int[n];
        int[] rs = new int[n];

        ls[0] = 0;
        for(int i = 1; i < n; i++) {
            ls[i] = nums[i - 1] + ls[i - 1];
        }

        rs[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--) {
            rs[i] = nums[i + 1] + rs[i + 1];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = Math.abs(ls[i] - rs[i]);
        }

        return nums;
    }
}