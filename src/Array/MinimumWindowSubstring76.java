package Array;

public class MinimumWindowSubstring76 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(sol.minWindow(s, t));
    }
}

// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

class Solution {

    public static boolean isSubString(String subStr, String t) {
        int[] freq = new int[256];
        
        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        for(char ch : subStr.toCharArray()) {
            if(freq[ch] > 0) {
                freq[ch]--;
            }
        }

        for(int val : freq) {
            if(val > 0) {
                return false;
            }
        }

        return true;
    }
    
    public String minWindow(String s, String t) {

        // ---------------------------------------------
        // Approach 1: Brute Force
        // Time: O(n^3)
        // Space: O(1)

        // int s1 = s.length();
        // int s2 = t.length();
        // String res = "";
        // int minLen = Integer.MAX_VALUE;

        // for(int i = 0; i < s1; i++) {
        //     for(int j = i; j < s1; j++) {
        //         String subStr = s.substring(i, j + 1);

        //         if(isSubString(subStr, t)) {
        //             int subLen = subStr.length();
        //             if(subLen < minLen) {
        //                 minLen = subLen;
        //                 res = subStr;
        //             }
        //         }
        //     }
        // }

        // return res;

        // ---------------------------------------------
        // Approach 2: Sliding Window + Frequency Array
        // Time: O(n)
        // Space: O(1)

        int s1 = s.length();
        int s2 = t.length();

        int i = 0, j = 0;
        int[] freq = new int[256];
        int count = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;

        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        while(j < s1) {
            if(freq[s.charAt(j)] > 0) {
                count++;
            }
            freq[s.charAt(j)]--;

            while(count == s2) {
                if(len > j - i + 1) {
                    len = j - i + 1;
                    start = i;
                }

                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)] > 0) {
                    count--;
                }
                i++;
            }
            j++;
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}