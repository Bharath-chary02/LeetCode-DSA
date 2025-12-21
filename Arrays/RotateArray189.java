import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Solution sol = new Solution();
        sol.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}

// Problem: 189. Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

class Solution {

    // MAIN method
    public void rotate(int[] nums, int k) {
        // rotateBruteForce(nums, k);   // Approach 1
        rotateReverse(nums, k);        // Approach 2 (Optimal)
    }

    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(k * n)
    // Space: O(1)
    public void rotateBruteForce(int[] nums, int k) {
        int n = nums.length - 1;
        k = k % nums.length;

        while (k > 0) {
            int last = nums[n];
            for (int i = n; i > 0; i--) {
                int temp = nums[i - 1];
                nums[i] = temp;
            }
            nums[0] = last;
            k--;
        }
    }

    // ---------------------------------------------
    // Approach 2: Reverse Array (YOUR SAME LOOPS)
    // Time: O(n)
    // Space: O(1)
    public void rotateReverse(int[] nums, int k) {
        int n = nums.length - 1;
        k = k % nums.length;

        // reverse whole array
        for (int i = 0, j = n; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // reverse first k elements
        for (int i = 0, j = k - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // reverse remaining elements
        for (int i = k, j = n; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
