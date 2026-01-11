package Array;
import java.util.*;

public class Four4Sum18 {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;

        Solution sol = new Solution();

        System.out.println(sol.fourSum(nums, target));
    }
}

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i + 1; j < n; ) {
                int p = j + 1, q = n - 1;
                while(p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target) {
                        p++;
                    } else if(sum > target) {
                        q--;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        p++;
                        q--;
                        while(p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }
                    }
                }

                j++;
                while(j < n && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }

        return list;
    }
}