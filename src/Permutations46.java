import java.util.*;

public class Permutations46 {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = obj.permute(nums);

        System.out.println(result);
    }   
}

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

class Solution {

    public static void helper(int[] nums, int idx, List<List<Integer>> ans) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Backtracking - Swap Method)
        // Time Complexity: O(n!)
        // Space Complexity: O(1) (excluding output storage)

        if(idx == nums.length) {
            List<Integer> al = new ArrayList<>();
            for(int n : nums) {
                al.add(n);
            }
            ans.add(al);
            return;
        }

        for(int i = idx; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            helper(nums, idx + 1, ans);
            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);

        return ans;
    }
}