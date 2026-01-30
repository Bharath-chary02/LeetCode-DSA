package Array;

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