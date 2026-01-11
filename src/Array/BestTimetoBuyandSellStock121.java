package Array;

public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution sol = new Solution();
        System.out.println(sol.maxProfit(prices));
    }
}

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

class Solution {

    // ---------------------------------------------
    // Approach 1: Greedy (Single Pass)
    // Time: O(n)
    // Space: O(1)

    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}