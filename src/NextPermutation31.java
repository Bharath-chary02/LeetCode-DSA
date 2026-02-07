
import java.util.Arrays;

// import java.util.*;

public class NextPermutation31 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution sol = new Solution();

        sol.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]

class Solution {

    // ---------------------------------------------
    // Approach 2: Optimal (Reverse Suffix)
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            // ---------------------------------------------
            // Approach 1: Using Arrays.sort()
            // Time Complexity: O(n log n)
            // Space Complexity: O(1)

            // Arrays.sort(nums);


            // ---------------------------------------------
            // Approach 2: Optimal (Reverse Suffix)
            // Time Complexity: O(n)
            // Space Complexity: O(1)
            int i = 0, j = n - 1;
            while(i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }

        for(int i = n - 1; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        int i = pivot + 1, j = n - 1;
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}