public class SearchinRotatedSortedArray33 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = sol.search(nums, target);
        System.out.println(result);
    }
}

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

class Solution {
    public int search(int[] nums, int target) {

        // ---------------------------------------------
        // Approach: Binary Search on Rotated Sorted Array
        // Time: O(log n)
        // Space: O(1)

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[start] <= nums[mid]) {
                if(nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}