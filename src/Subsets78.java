import java.util.*;

public class Subsets78 {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = obj.subsets(nums);

        System.out.println(result);
    }
}

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

class Solution {

    public static void helper(int[] nums, int i, List<List<Integer>> res, List<Integer> subsets) {
        if(i == nums.length) {
            res.add(new ArrayList<>(subsets));
            return;
        }

        subsets.add(nums[i]);
        helper(nums, i + 1, res, subsets);
        subsets.remove(subsets.size() - 1);
        helper(nums, i + 1, res, subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Using For Loop)
        // Time Complexity: O(n^2)
        // Space Complexity: O(n^2)

        // int n = nums.length;
        // List<List<Integer>> res = new ArrayList<>();

        // for(int i = 0; i < n; i++) {
        //     List<Integer> elems = new ArrayList<>();
        //     for(int j = i; j < n; j++) {
        //         elems.add(nums[j]);
        //     }
        //     res.add(elems);
        // }

        // res.add(new ArrayList<>());

        // return res;

        

        // ---------------------------------------------
        // Approach 2: Recursion (Include / Exclude)
        // Time Complexity: O(2^n)
        // Space Complexity: O(n)  (recursion stack)

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subsets = new ArrayList<>();

        helper(nums, 0, res, subsets);

        return res;
    }
}