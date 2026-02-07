

// import java.util.*;

public class FindtheDuplicateNumber287 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        Solution sol = new Solution();
        System.out.println("Duplicate = " + sol.findDuplicate(nums));
    }
}

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2

class Solution {
    public int findDuplicate(int[] nums) {
        // ---------------------------------------------
        // Approach 1: Sorting
        // Time: O(n log n)
        // Space: O(1) (Ignoring sorting extra space in some implementations)

        // int n = nums.length;
        // Arrays.sort(nums);
        // int res = 0;
        // for(int i = 0; i < n - 1; i++) {
        //     if(nums[i] == nums[i + 1]) {
        //         res = nums[i];
        //         break;
        //     }
        // }

        // return res;

        // ---------------------------------------------
        // Approach 2: Frequency Array
        // Time: O(n)
        // Space: O(n)

        // int n = nums.length;
        // int[] freq = new int[n];
        // int res = 0;
        // for(int i = 0; i < n; i++) {
        //     freq[nums[i] - 1]++;
        // }
        // for(int i = 0; i < n; i++) {
        //     if(freq[i] >= 2) {
        //         res = i + 1;
        //         break;
        //     }
        // }

        // return res;

        // ---------------------------------------------
        // Approach 3: Floyd’s Tortoise & Hare (Cycle Detection)
        // Time: O(n)
        // Space: O(1)

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}