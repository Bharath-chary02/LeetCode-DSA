package Array;

import  java.util.*;

public class LargestRectangleinHistogram84 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(sol.largestRectangleArea(heights));
    }
}

// Example 1:

// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.

class Solution {
    public int largestRectangleArea(int[] heights) {

    // ---------------------------------------------
    // Approach 1: Using NSL + NSR arrays (Monotonic Stack)
    // Time: O(n)
    // Space: O(n)

        // int n = heights.length;
        // int max = 0;
        // int[] nsr = new int[n];
        // int[] nsl = new int[n];

        // Stack<Integer> st = new Stack<>();

        // for(int i = n - 1; i >= 0; i--) {
        //     while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
        //         st.pop();
        //     }
        //     if(st.isEmpty()) {
        //         nsr[i] = n;
        //     } else {
        //         nsr[i] = st.peek();
        //     }
        //     st.push(i);
        // }

        // st = new Stack<>();

        // for(int i = 0; i < n ; i++) {
        //     while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
        //         st.pop();
        //     }
        //     if(st.isEmpty()) {
        //         nsl[i] = -1;
        //     } else {
        //         nsl[i] = st.peek();
        //     }
        //     st.push(i);
        // }

        // for(int i = 0; i < n; i++) {
        //     int ht = heights[i];
        //     int width = nsr[i] - nsl[i] - 1;
        //     int currArea = ht * width;
        //     max = Math.max(currArea, max);
        // }

        // return max;

    
    }
}