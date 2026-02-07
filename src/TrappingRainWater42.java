

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

        // -------------------------------------------------------
        // Approach 2: Prefix + Suffix Arrays
        // Time: O(n)
        // Space: O(n)

        // int n = height.length;
        // int ans = 0;

        // int[] leftMax = new int[n];
        // leftMax[0] = height[0];
        // for(int i = 1; i < n; i++) {
        //     leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        // }

        // int[] rightMax = new int[n];
        // rightMax[n - 1] = height[n - 1];
        // for(int i = n - 2; i >= 0; i--) {
        //     rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        // }

        // for(int i = 1; i < n - 1; i++) {
        //     ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        // }

        // return ans;

        // -------------------------------------------------------
        // Approach 3: Two Pointers (Optimal)
        // Time: O(n)
        // Space: O(1)

        int n = height.length;
        int ans = 0;

        int lowMax = height[0];
        int rightMax = height[n - 1];

        int low = 1;
        int high = n - 2;
        while(low <= high) {
            lowMax = Math.max(lowMax, height[low]);
            rightMax = Math.max(rightMax, height[high]);
            
            if(lowMax > rightMax) {
                ans += rightMax - height[high];
                high--;
            } else {
                ans += lowMax - height[low];
                low++;
            }
        }

        return ans;
    }
}