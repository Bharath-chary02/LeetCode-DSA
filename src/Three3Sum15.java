
import java.util.*;

public class Three3Sum15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution sol = new Solution();
        System.out.println(sol.threeSum(nums));
    }
}

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

class Solution {
    // ---------------------------------------------
    // Approach: Sorting + Two Pointers (Optimal)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    outer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    
                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }

                
            }
        }

        return outer;
    }
}