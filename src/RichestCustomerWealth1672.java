public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        Solution obj = new Solution();
        int result = obj.maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + result);
    }
}

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.

class Solution {
    public int maximumWealth(int[][] accounts) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(m * n)
        // Space: O(1)

        int res = 0;
        int maxWealth = 0;
        for(int[] arr : accounts) {
            for(int i = 0; i < arr.length; i++) {
                res += arr[i];
            }
            
            maxWealth = Math.max(res, maxWealth);
            res = 0;
        }

        return maxWealth;
    }
}