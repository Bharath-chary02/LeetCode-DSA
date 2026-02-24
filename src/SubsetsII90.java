import java.util.*;

public class SubsetsII90 {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 2};

        List<List<Integer>> result = obj.subsetsWithDup(nums);

        System.out.println(result);
    }
}

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

class Solution {
    // ---------------------------------------------
    // Approach 1: Include / Exclude Recursion
    // Time: O(2^n)
    // Space: O(n)

    public static void helper(int[] nums, int i, List<List<Integer>> res, List<Integer> subs) {
        if(i == nums.length) {
            res.add(new ArrayList<>(subs));
            return;
        }

        subs.add(nums[i]);
        helper(nums, i + 1, res, subs);
        subs.remove(subs.size() - 1);

        int idx = i + 1;
        while(idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }
        helper(nums, idx, res, subs);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subs = new ArrayList<>();
        Arrays.sort(nums);

        helper(nums, 0, res, subs);

        return res;
    }
}