public class PeakIndexinaMountainArray852 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] arr1 = {0, 1, 0};
        System.out.println(sol.peakIndexInMountainArray(arr1));
    }
}

// Example 1:

// Input: arr = [0,1,0]

// Output: 1

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n)
        // Space: O(1)

        // int n = arr.length;
        // int idx = 0;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i];
        //         idx = i;
        //     }
        // }

        // return idx;

        
    }
}