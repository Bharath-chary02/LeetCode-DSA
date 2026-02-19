import java.util.*;

public class PalindromePartitioning131 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.partition("aab"));
    }
}

// Example 1:

// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]

class Solution {

    public static boolean isPalindrome(String str) {
        if(str.length() == 1) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void backtrack(String s, int start, List<String> elems, List<List<String>> res) {
        if(start == s.length()) {
            res.add(new ArrayList<>(elems));
            return;
        }

        for(int end = start; end < s.length(); end++) {
            String sub = s.substring(start, end + 1);

            if(isPalindrome(sub)) {
                // Choose
                elems.add(sub);
                // Explore
                backtrack(s, end + 1, elems, res);
                // Undo
                elems.remove(elems.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {

        // ---------------------------------------------
        // Approach 1: Backtracking (Brute Force)
        // Time: O(2^n * n)
        // Space: O(n)

        List<List<String>> res = new ArrayList<>();
        List<String> elems = new ArrayList<>();

        backtrack(s, 0, elems, res);

        return res;
        
    }
}