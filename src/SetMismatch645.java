public class SetMismatch645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Solution obj = new Solution();
        int[] ans = obj.findErrorNums(nums);

        System.out.println("Duplicate: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}

class Solution {

    // ---------------------------------------------
    // Approach: Frequency Array
    // Time: O(n)
    // Space: O(n)

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        // Arrays.sort(nums);
        int idx = -1;
        for(int i = 0; i < n; i++) {
            freq[nums[i]]++;
            if(freq[nums[i]] > 1) {
                idx = nums[i];
            }
        }
        
        int val = -1;
        for(int i = 1; i <= n; i++) {
            if(freq[i] == 0) {
                val = i;
            }
        } 
        return new int[] {idx, val};
    }
}