

public class LongestHappyPrefix1392 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.longestPrefix("level"));
    }
}

// Example 1:

// Input: s = "level"
// Output: "l"
// Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

class Solution {
    public String longestPrefix(String s) {

        // ---------------------------------------------
        // Approach: KMP (LPS Array)
        // Time: O(n)
        // Space: O(n)

        int n = s.length();
        int i = 1;
        int[] lps = new int[n];
        int len = 0;

        while(i < n) {
            if(s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int l = lps[n - 1];

        return s.substring(0, l);
    }
}