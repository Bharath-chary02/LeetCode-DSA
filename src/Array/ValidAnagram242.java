package Array;

// import java.util.*;

public class ValidAnagram242 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
    }
}



class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }


    // ================================
    // Approach 1: Sorting (Brute Force)
    // Time: O(n log n)
    // Space: O(n)

        
        // int n = s.length();

        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // for(int i = 0; i < n; i++) {
        //     if(arr1[i] != arr2[i]) {
        //         return false;
        //     }
        // }

        // return true;

    // ======================================
    // Approach 2: Frequency Count (Optimized)
    // Time: O(n)
    // Space: O(1)

        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            freq[ch - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}