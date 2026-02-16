import java.util.*;

public class CombinationSum39 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = sol.combinationSum(candidates, target);
        System.out.println(result);
    }
}

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.

class Solution {

    // public static void helper(int[] candidates, int target, int i, Set<List<Integer>> res, List<Integer> elems) {
    //     if(i == candidates.length || target < 0) {
    //         return;
    //     }

    //     if(target == 0) {
    //         if(!res.contains(elems)) {
    //             res.add(new ArrayList(elems));
    //         }
    //         return;
    //     }

    //     elems.add(candidates[i]);

    //     helper(candidates, target - candidates[i], i + 1, res, elems);
    //     helper(candidates, target - candidates[i], i, res, elems);
    //     elems.remove(elems.size() - 1);
    //     helper(candidates, target, i + 1, res, elems);
        
    // }

    public static void helper(int[] candidates, int target, int idx, List<List<Integer>> res, List<Integer> eles) {
        if(target == 0) {
            res.add(new ArrayList<>(eles));
            return;
        }

        for(int i = idx; i < candidates.length; i++) {
            if(candidates[i] > target) {
                break;
            }

            eles.add(candidates[i]);
            helper(candidates, target - candidates[i], i, res, eles);
            eles.remove(eles.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // ------------------------------------------------
        // Approach 1: Brute Force using Set
        // Time: O(n^(target/minCandidate))  -> Exponential
        // Space: O(n^(target/minCandidate)) -> Exponential (result storage)
        //        + O(target/minCandidate)   -> Recursion stack


        // Set<List<Integer>> res = new HashSet<>();
        // List<Integer> elems = new ArrayList<>();
        
        // helper(candidates, target, 0, res, elems);

        // return new ArrayList<>(res);

        // ------------------------------------------------
        // Approach 2: Backtracking with Pruning
        // Time: O(n^(target/minCandidate))  -> Exponential
        // Space: O(n^(target/minCandidate)) -> Exponential (result storage)
        //        + O(target/minCandidate)   -> Recursion stack


        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, res, new ArrayList<>());

        return res;
    }
}