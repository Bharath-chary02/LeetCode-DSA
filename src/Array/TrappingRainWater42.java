package Array;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution sol = new Solution();
        System.out.println(sol.trap(height));
    }
}

// Example 1:

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

class Solution {
    public int trap(int[] height) {

        // -------------------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n^2)
        // Space: O(1)

        // int n = height.length;
        // int ans = 0;

        // for(int i = 1; i < n - 1; i++) {
        //     int leftMax = height[i];
        //     for(int j = i - 1; j >= 0; j--) {
        //         leftMax = Math.max(leftMax, height[j]);
        //     }

        //     int rightMax = height[i];
        //     for(int j = i + 1; j < n; j++) {
        //         rightMax = Math.max(rightMax, height[j]);
        //     }

        //     ans += Math.min(leftMax, rightMax) - height[i];
        // }

        // return ans;

        
    }
}