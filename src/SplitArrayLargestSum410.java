public class SplitArrayLargestSum410 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        Solution obj = new Solution();
        System.out.println(obj.splitArray(nums, k));
    }
}

// Example 1:

// Input: nums = [7,2,5,10,8], k = 2
// Output: 18
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

class Solution {
    public int splitArray(int[] nums, int k) {

        // ---------------------------------------------
        // Approach: Binary Search on Answer
        // Time: O(n * log(sum))
        // Space: O(1)

        int n = nums.length;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            start = Math.max(start, nums[i]);
            sum += nums[i];
        }
        
        int ans = -1;

        while(start <= sum) {
            int mid = start + (sum - start) / 2;
            if(isValid(k, mid, nums)) {
                ans = mid;
                sum = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isValid(int k, int mid, int[] nums) {
        int tot = 1;
        int maxArr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > mid) {
                return false;
            }
            if(maxArr + nums[i] <= mid) {
                maxArr += nums[i];
            } else {
                tot++;
                maxArr = nums[i];
            }
        }

        if(tot > k) {
            return false;
        }

        return true;
    }
}