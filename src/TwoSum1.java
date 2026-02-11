import java.util.*;

public class TwoSum1 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if(result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found");
        }
    }
}

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // ---------------------------------------------
        // Approach 2: HashMap (Optimal)
        // Time: O(n)
        // Space: O(n)

        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int scnd = target - nums[i];
            if(mp.containsKey(scnd)) {
                return new int[] {mp.get(scnd), i};
            }
            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}