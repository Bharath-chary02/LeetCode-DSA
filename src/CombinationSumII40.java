import java.util.*;

public class CombinationSumII40 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = sol.combinationSum2(candidates, target);

        System.out.println(result);
    }
}

// Example 1:

// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]

class Solution {

    // ---------------------------------------------
    // Approach 1: Include / Exclude (Backtracking)
    // Time: O(2^n)
    // Space: O(n)  -> recursion stack

    // public static void helper(int[] candidates, int target, int idx, List<Integer> elems, List<List<Integer>> res) {

    //     if(target == 0) {
    //         res.add(new ArrayList<>(elems));
    //         return;
    //     }

    //     if(target < 0 || idx == candidates.length ) {
    //         return;
    //     }

    //     elems.add(candidates[idx]);
    //     helper(candidates, target - candidates[idx], idx + 1, elems, res);
    //     elems.remove(elems.size() - 1);

    //     int nextIdx = idx + 1;
    //     while(nextIdx < candidates.length && candidates[nextIdx] == candidates[idx]) {
    //         nextIdx++;
    //     }
    //     helper(candidates, target, nextIdx, elems, res);
    // }

    

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> elems = new ArrayList<>();
        helper(candidates, target, 0, elems, res);

        return res;
    }
}