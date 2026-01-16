package Array;

// import java.util.*;

public class FindtheDuplicateNumber287 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        Solution sol = new Solution();
        System.out.println("Duplicate = " + sol.findDuplicate(nums));
    }
}

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2

class Solution {
    public int findDuplicate(int[] nums) {
        // ---------------------------------------------
        // Approach 1: Sorting
        // Time: O(n log n)
        // Space: O(1) (Ignoring sorting extra space in some implementations)

        // int n = nums.length;
        // Arrays.sort(nums);
        // int res = 0;
        // for(int i = 0; i < n - 1; i++) {
        //     if(nums[i] == nums[i + 1]) {
        //         res = nums[i];
        //         break;
        //     }
        // }

        // return res;

        
    }
}