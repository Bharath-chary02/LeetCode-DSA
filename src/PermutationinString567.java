

import java.util.*;

public class PermutationinString567 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion("ab", "eidbaooo"));
    }
}

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // ---------------------------------------------
        // Approach 1: Brute Force using Sorting
        // Time: O(n * k log k)
        // Space: O(k)

        // int n1 = s1.length();
        // int n2 = s2.length();
        // if(n1 > n2) {
        //     return false;
        // }

        // char[] arr1 = s1.toCharArray();
        // Arrays.sort(arr1);

        // for(int i = 0; i <= n2 - n1; i++) {
        //     char[] temp = s2.substring(i, i + n1).toCharArray();
        //     Arrays.sort(temp);
        //     if(Arrays.equals(arr1, temp)) {
        //         return true;
        //     }
        // }

        // return false;

        // ---------------------------------------------
        // Approach 2: Brute Force using Frequency Check
        // Time: O(n * k)
        // Space: O(26)


        // int n1 = s1.length();
        // int n2 = s2.length();

        // for(int i = 0; i <= n2 - n1; i++) {
        //     String sub = s2.substring(i, i + n1);
        //     if(isAnagram(sub, s1)) {
        //         return true;
        //     }
        // }

        // return false;

        // ---------------------------------------------
        // Approach 3: Sliding Window (Optimized)
        // Time: O(n ^ 2)
        // Space: O(26)

        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 > n2) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2)) {
            return true;
        }

        int j = 0;
        for(int i = n1; i < n2; i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(j) - 'a']--;
            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
            j++;
        }

        return false;
    }

    // Helper for Approach 2
    
    // public static boolean isAnagram(String sub, String s1) {
    //     int[] count = new int[26];

    //     for(char c : sub.toCharArray()) {
    //         count[c - 'a']++;
    //     }

    //     for(char c : s1.toCharArray()) {
    //         count[c - 'a']--;
    //     }

    //     for(int i : count) {
    //         if(i != 0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}