package Array;

public class ReversePairs493 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, 2, 3, 1};

        System.out.println(sol.reversePairs(nums));
    }
}

// Example 1:

// Input: nums = [1,3,2,3,1]
// Output: 2
// Explanation: The reverse pairs are:
// (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
// (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

class Solution {

    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }

        for(int i = 0; i < n2; i++) {
            right[i] = nums[mid + 1 + i];
        }

        int k = low, i = 0, j = 0;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while(i < n1) {
            nums[k++] = left[i++];
        }

        while(j < n2) {
            nums[k++] = right[j++];
        }
    }

    public static int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for(int i = low; i <= mid; i++) {
            while(right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }

        return count;
    }

    public static int mergeSort(int[] nums, int low, int high) {
        int count = 0;
        if(low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += countPairs(nums, low, mid, high);
            merge(nums, low, mid, high);
        }

        return count;
    }

    public int reversePairs(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n^2)
        // Space: O(1)

        // int n = nums.length;
        // int c = 0;

        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if((long) nums[i] > 2L * nums[j]) {
        //             c++;
        //         }
        //     }
        // }

        // return c;

        // ---------------------------------------------
        // Approach 2: Merge Sort + Two Pointer Counting
        // Time: O(n log n)
        // Space: O(n)

        int low = 0;
        int high = nums.length - 1;
        return mergeSort(nums, low, high);
    }
}