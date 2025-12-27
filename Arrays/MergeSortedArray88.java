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

        // ---------------------------------------------
        // Approach 2: Two Pointers + Extra Array
        // Time: O(m + n)
        // Space: O(m + n)

        /*
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while(i < m) {
            res[k++] = nums1[i++];
        }
        while(j < n) {
            res[k++] = nums2[j++];
        }

        for(int x = 0; x < m + n; x++) {
            nums1[x] = res[x];
        }
        */

        // ---------------------------------------------
        // Approach 3: Optimal In-place (Two Pointers from End)
        // Time: O(m + n)
        // Space: O(1)

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(i >= 0) {
            nums1[k--] = nums1[i--];
        }

        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
