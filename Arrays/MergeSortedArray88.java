import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Copy + Sort)
        // Time: O((m + n) log(m + n))
        // Space: O(m + n)

        /*
        int[] res = new int[m + n];
        for(int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }
        for(int i = m; i < m + n; i++) {
            res[i] = nums2[i - m];
        }

        Arrays.sort(res);
        for(int x = 0; x < m + n; x++) {
            nums1[x] = res[x];
        }
        */

        
    }
}
