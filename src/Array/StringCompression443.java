package Array;

import java.util.*;

public class StringCompression443 {
    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};

        Solution sol = new Solution();
        int newLength = sol.compress(chars);

        System.out.println("New Length: " + newLength);
        System.out.print("Compressed Array: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}

// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

class Solution {
    public int compress(char[] chars) {

        // ---------------------------------------------
        // Approach: Two Pointers (In-place Compression)
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = chars.length;
        
        int idx = 0;
        int i = 0;
        while(i < n) {
            char ch = chars[i];
            int count = 0;
            while(i < n && ch == chars[i]) {
                count++;
                i++;
            }
            chars[idx++] = ch;
            if(count > 1) {
                String str = String.valueOf(count);
                for(int j = 0; j < str.length(); j++) {
                    chars[idx++] = str.charAt(j);
                }
            }
        }

        return idx;
    }
}