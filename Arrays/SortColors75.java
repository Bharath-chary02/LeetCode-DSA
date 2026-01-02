import java.util.Arrays;

public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        Solution sol = new Solution();
        sol.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

class Solution {
    public void sortColors(int[] nums) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n)
        // Space: O(1) in practice, but O(k) formally (k = 3)

        // int n = nums.length;
        // if(n == 1) {
        //     return;
        // }
        // int[] freq = new int[3];
        // for(int i = 0; i < n; i++) {
        //     freq[nums[i]]++;
        // }
        // int j = 0;

        // for(int i = 0; i < 3; i++) {
        //     while(freq[i] > 0) {
        //         nums[j] = i;
        //         j++;
        //         freq[i]--;
        //     }
        // }

        // ---------------------------------------------
        // Approach 2: Dutch National Flag (Three Pointer)
        // Time: O(n)
        // Space: O(1)

        int n = nums.length;
        int mid = 0, low = 0, high = n - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}