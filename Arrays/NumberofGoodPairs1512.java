
public class NumberofGoodPairs1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        Solution sol = new Solution();

        System.out.println(sol.numIdenticalPairs(nums));
    }
}

// Problem: 1512. Number of Good Pairs
// Link: https://leetcode.com/problems/number-of-good-pairs/description/
// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n * n)
        // Space: O(1)

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        // }

        
        return count;
    }
}
