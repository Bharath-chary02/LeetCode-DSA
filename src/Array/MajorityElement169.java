package Array;
// import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        Solution sol = new Solution();

        System.out.println(sol.majorityElement(nums));
    }
}

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n * n)
        // Space: O(1)

        // int count = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n / 2){
        //         return nums[i];
        //     }
        //     count = 0;
        // }
        // return nums[i];

        // ---------------------------------------------
        // Approach 2: Sorting
        // Time: O(n logn)
        // Space: O(1)

        // Arrays.sort(nums);
        // int count = 0;
        // int a = nums[0];
        // for(int i = 0; i < n; i++){
        //     if(nums[i] == a){
        //         count++;
        //         if(count > n / 2){
        //             return nums[i];
        //         }
        //     }
            
        //     if(nums[i] != a){
        //         count = 1;
        //         a = nums[i];
        //     }
        // }
        // return a;

        // ---------------------------------------------
        // Approach 3: Boyer–Moore Voting Algorithm
        // Time: O(n)
        // Space: O(1)

        int candidate = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
}