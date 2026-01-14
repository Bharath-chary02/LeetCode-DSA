package Array;

import java.util.*;

public class ProductofArrayExceptSelf238 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};

        Solution sol = new Solution();

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(sol.productExceptSelf(nums1)));
    }
}

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

class Solution {
    public int[] productExceptSelf(int[] nums) {

    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(n^2)
    // Space: O(1) extra (excluding output array)

        // int n = nums.length;
        // int[] res = new int[n];
        // for(int i = 0; i < n; i++) {
        //     res[i] = 1;
        // }
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(i == j) {
        //             continue;
        //         }
        //         res[i] *= nums[j];
        //     }
        // }

        // return res;

    
    }
}