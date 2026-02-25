public class SortanArray912 {
    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        Solution obj = new Solution();
        nums = obj.sortArray(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Example 1:

// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

class Solution {

    // ---------------------------------------------
    // Approach: Merge Sort
    // Time Complexity : O(n log n)
    // Space Complexity: O(n)

    public static void mergeSort(int[] nums, int s, int e) {
        if(s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(nums, s, mid);
        mergeSort(nums, mid + 1, e);

        merge(nums, s, mid, e);
    }

    public static void merge(int[] nums, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= e) {
            if(nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else{
                temp[k++] = nums[j++];
            }
        }
        
        while(i <= mid) {
            temp[k++] = nums[i++];
        }

        while(j <= e) {
            temp[k++] = nums[j++];
        }

        for(k = 0, i = s; k < temp.length; i++, k++) {
            nums[i] = temp[k];
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }
}