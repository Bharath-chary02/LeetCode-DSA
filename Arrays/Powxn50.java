public class Powxn50 {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        Solution sol = new Solution();
        System.out.println(sol.myPow(x, n));
    }
}

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000

class Solution {

    // ---------------------------------------------
    // Approach: Binary Exponentiation (Iterative)
    // Time: O(log n)
    // Space: O(1)

    public double myPow(double x, int n) {

        long binDup = n;
        if(binDup < 0) {
            x = 1 / x;
            binDup = -(binDup);
        }
        double ans = 1;
        while(binDup > 0) {
            if((binDup & 1) != 0) {
                ans = ans * x;
            }
            x = x * x;
            binDup = binDup >> 1;
        }

        return ans;
    }
}