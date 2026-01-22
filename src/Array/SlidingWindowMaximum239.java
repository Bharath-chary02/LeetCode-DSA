package Array;

import java.util.*;

public class SlidingWindowMaximum239 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(sol.maxSlidingWindow(nums, k)));
    }
}

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(n * k)
    // Space: O(1)

        // int n = nums.length;
        // int[] res = new int[n - k + 1];

        // for(int i = 0; i < n; i++) {
        //     int max = Integer.MIN_VALUE;
        //     int j = i;
        //     int c = 0;
        //     while(c < k && j < n) {
        //         max = Math.max(max, nums[j]);
        //         j++;
        //         c++;
        //     }
        //     if(i < res.length) {
        //         res[i] = max;
        //     }
        // }

        // return res;

    
    }
}