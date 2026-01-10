package Strings;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Solution sol = new Solution();
        sol.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}

// Example 1:
//
// Input:  s = ['h','e','l','l','o']
// Output: ['o','l','l','e','h']

class Solution {

    // ---------------------------------------------
    // Approach 1: Two Pointer (In-place)
    // Time: O(n)
    // Space: O(1)
    public void reverseString(char[] s) {
        int lp = 0, rp = s.length - 1;

        while (lp < rp) {
            char temp = s[lp];
            s[lp] = s[rp];
            s[rp] = temp;

            lp++;
            rp--;
        }
    }
}
