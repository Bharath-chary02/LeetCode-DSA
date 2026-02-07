
public class SingleNumber136 {
    public static void main(String[] args) {

        int[] nums = {2, 2, 1};

        Solution sol = new Solution();
        System.out.println(sol.singleNumber(nums));
    }
}

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

class Solution {
    // ---------------------------------------------
    // Approach 1: XOR Operation
    // Time: O(n)
    // Space: O(1)
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int i = 0; i < nums.length; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}