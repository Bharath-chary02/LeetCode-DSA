package Array;
public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Solution sol = new Solution();

        System.out.println(sol.maxSubArray(nums));
    }
}

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

class Solution {
    public int maxSubArray(int[] nums) {

        // Brute Force (O(n^2)) – Not accepted due to TLE

        // int[] prefix = new int[nums.length];
        // int currSum = 0;
        // int maxSum = Integer.MIN_VALUE;

        // prefix[0] = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     prefix[i] = prefix[i - 1] + nums[i];
        // }

        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i; j < nums.length; j++) {
        //         currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        //         if(currSum > maxSum) {
        //             maxSum = currSum;
        //         }
        //     }
        // }

        // return maxSum;

        // ---------------------------------------------
        // Approach 1: Kadane’s Algorithm
        // Time: O(n)
        // Space: O(1)

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}