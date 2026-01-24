package Array;

public class ReversePairs493 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, 2, 3, 1};

        System.out.println(sol.reversePairs(nums));
    }
}

// Example 1:

// Input: nums = [1,3,2,3,1]
// Output: 2
// Explanation: The reverse pairs are:
// (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
// (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

class Solution {

    

    public int reversePairs(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n^2)
        // Space: O(1)

        // int n = nums.length;
        // int c = 0;

        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if((long) nums[i] > 2L * nums[j]) {
        //             c++;
        //         }
        //     }
        // }

        // return c;

        // ---------------------------------------------
        // Approach 2: Merge Sort + Two Pointer Counting
        // Time: O(n log n)
        // Space: O(n)

        int low = 0;
        int high = nums.length - 1;
        return mergeSort(nums, low, high);
    }
}