package Array;

public class ReverseStringPrefix3794 {
    public static void main(String[] args) {

        String s = "abcd";
        int k = 2;

        Solution sol = new Solution();
        String result = sol.reversePrefix(s, k);

        System.out.println(result); 
    }
}

// Example 1:
//
// Input: s = "abcd", k = 2
// Output: "bacd"
// Explanation:
// The first k = 2 characters "ab" are reversed to "ba".
// The final resulting string is "bacd".

class Solution {
    // ---------------------------------------------
    // Approach 1: Brute Force
    // Time: O(n)
    // Space: O(1) (excluding output string)
    public String reversePrefix(String s, int k) {

        StringBuilder str = new StringBuilder();

        for (int i = k - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        for (int i = k; i < s.length(); i++) {
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}
