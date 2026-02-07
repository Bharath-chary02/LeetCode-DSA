

import java.util.*;

public class SubarraySumEqualsK560 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        Solution sol = new Solution();
        System.out.println(sol.subarraySum(nums, k));
    }
}

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2

class Solution {
    public int subarraySum(int[] nums, int k) {
         // ---------------------------------------------
        // Approach 1: Brute Force (Nested Loops)
        // Time: O(n^2)
        // Space: O(1)

        // int n = nums.length;
        
        // int c = 0;
        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if(sum == k) {
        //             c++;
        //         }
        //     }
            
        // }
        // return c;

        // ---------------------------------------------
        // Approach 2: Prefix Sum + Brute Force
        // Time: O(n^2)
        // Space: O(n)

        // int n = nums.length;
        // int[] prefix = new int[n];
        // int c = 0;
        // prefix[0] = nums[0];
        // for(int i = 1; i < n; i++) {
        //     prefix[i] = prefix[i - 1] + nums[i];
        // }

        // for(int i = 0; i < n; i++) {
        //     int cs = 0;
        //     for(int j = i; j < n; j++) {
        //         cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        //         if(cs == k) {
        //             c++;
        //         }
        //     }
            
        // }
        // return c;

        // ---------------------------------------------
        // Approach 3: Prefix Sum + HashMap (Optimal)
        // Time: O(n)
        // Space: O(n)

        int n = nums.length;
        int prefixSum = 0;
        int c = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // important: prefixSum 0 seen once (empty subarray)

        for(int i = 0; i < n; i++) {
            prefixSum += nums[i];

            int needed = prefixSum - k;
            if(hm.containsKey(needed)) {
                c += hm.get(needed);
            }

            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
        }

        return c;
    }
}