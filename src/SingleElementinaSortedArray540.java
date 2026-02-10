public class SingleElementinaSortedArray540 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(sol.singleNonDuplicate(nums));
    }
}

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

class Solution {
    public int singleNonDuplicate(int[] nums) {

        // ---------------------------------------------
        // Approach: Binary Search
        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        int start = 0;
        int end = n - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid == 0 && nums[0] != nums[1]) {
                return nums[0];
            }

            if(mid == n - 1 && nums[n - 1] != nums[n - 2]) {
                return nums[n - 1];
            }

            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if(mid % 2 == 0) {
                if(nums[mid] == nums[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid] == nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}