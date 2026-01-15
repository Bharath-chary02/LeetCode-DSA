package Array;

import java.util.*;

public class SubarraySumEqualsK560 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        Solution sol = new Solution();
        System.out.println(sol.subarraySum(nums, k));
    }
}

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2

class Solution {
    public int subarraySum(int[] nums, int k) {
         // ---------------------------------------------
        // Approach 1: Brute Force (Nested Loops)
        // Time: O(n^2)
        // Space: O(1)

        // int n = nums.length;
        
        // int c = 0;
        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if(sum == k) {
        //             c++;
        //         }
        //     }
            
        // }
        // return c;

        
    }
}