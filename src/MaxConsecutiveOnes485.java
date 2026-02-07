
public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        Solution sol = new Solution();
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}

// Problem: 485. Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/description/
// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            if(nums[i] == 0){
                count = 0;
            }
        }
        return maxCount;
    }
}
