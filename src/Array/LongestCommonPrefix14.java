package Array;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println("Input: " + Arrays.toString(strs1));
        System.out.println("Output: " + sol.longestCommonPrefix(strs1));
    }
}

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

class Solution {
    public String longestCommonPrefix(String[] strs) {

        // ---------------------------------------------
        // Approach 1: Vertical Scanning (Brute Force)
        // Time: O(n * k)
        // Space: O(1)

        // int n = strs.length;
        // String res = "";
        // for(int i = 0; i < strs[0].length(); i++) {
        //     char ch = strs[0].charAt(i);
        //     for(String s : strs) {
        //         if(i >= s.length() || ch != s.charAt(i)) {
        //             return res;
        //         }
        //     }
        //     res += ch;
        // }

        // return res;

        
    }
}