// import java.util.*;

public class FirstUniqueCharacterinaString387 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(sol.firstUniqChar(s1)); // 0
        System.out.println(sol.firstUniqChar(s2)); // 2
        System.out.println(sol.firstUniqChar(s3)); // -1
    }
}

class Solution {
    public int firstUniqChar(String s) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Queue Simulation)
        // Time: O(n)
        // Space: O(n)

        // Queue<Character> q = new LinkedList<>();

        // int[] freq = new int[26];

        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     freq[ch - 'a']++;
        // }

        // for(int i = 0; i < s.length(); i++) {
        //     q.add(s.charAt(i));
        // }

        // for(int i = 0; i < s.length(); i++) {
        //     if(!q.isEmpty()) {
        //         char ch = q.remove();
        //         if(freq[ch - 'a'] == 1) {
        //             return i;
        //         }
        //     }
        // }

        // return -1;

        // ---------------------------------------------
        // Approach 2: Frequency Count (Optimal)
        // Time: O(n)
        // Space: O(1)

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}