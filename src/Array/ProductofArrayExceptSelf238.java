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

    // ---------------------------------------------
    // Approach 2: Using Division (Handles zeros)
    // Time: O(n)
    // Space: O(1) extra (excluding output array)

        // int n = nums.length;
        // int[] ans = new int[n];
        // int mul = 1;
        // int c = 0;
        // for(int i = 0; i < n; i++) {
        //     if(nums[i] != 0) {
        //         mul *= nums[i];
        //     } else {
        //         c++;
        //     }
        // }

        // for(int i = 0; i < n; i++) {
        //     if(nums[i] != 0) {
        //         if(c == 0) {
        //             ans[i] = mul / nums[i];
        //         } else {
        //             ans[i] = 0;
        //         }
        //     } else {
        //         if(c == 1) {
        //             ans[i] = mul;
        //         } else {
        //             ans[i] = 0;
        //         }
        //     }
        // }
        
        // return ans;

    // ---------------------------------------------
    //  Approach 3: Prefix + Suffix (No division Best)
    // Time: O(n)
    // Space: O(1) extra (excluding output array)

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}