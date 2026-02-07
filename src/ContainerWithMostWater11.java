
public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        Solution sol = new Solution();
        System.out.println(sol.maxArea(height));
    }
}

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

class Solution {

    // ---------------------------------------------
    // Approach 1: Two Pointer
    // Time: O(n)
    // Space: O(1)

    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int maxArea = 0;
        while(lp < rp) {
            int minHt = Math.min(height[lp], height[rp]);
            maxArea = Math.max(maxArea, minHt * (rp - lp));
            if(height[lp] < height[rp]) {
                lp++;
            } else{
                rp--;
            }
        }
        
        return maxArea;
    }
}