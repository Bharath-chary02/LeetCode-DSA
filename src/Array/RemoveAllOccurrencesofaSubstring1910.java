package Array;

public class RemoveAllOccurrencesofaSubstring1910 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeOccurrences("daabcbaabcbc", "abc"));
    }
}

// Example 1:

// Input: s = "daabcbaabcbc", part = "abc"
// Output: "dab"
// Explanation: The following operations are done:
// - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
// - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
// - s = "dababc", remove "abc" starting at index 3, so s = "dab".
// Now s has no occurrences of "abc".

class Solution {
    public String removeOccurrences(String s, String part) {
        // ---------------------------------------------
        // Approach 1: Brute Force (Repeated String Replacement)
        // Time: O(n²)
        // Space: O(1)   // ignoring output string (Java strings are immutable)

        while(s.contains(part)) {
            s = s.replaceFirst(part, "");
        }

        return s;
    }
}