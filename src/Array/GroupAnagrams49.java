package Array;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = sol.groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // ---------------------------------------------
        // Approach 1: Sorting-Based Hashing
        // Time: O(n * k log k)
        // Space: O(n * k)

        // List<List<String>> res = new ArrayList<>();
        // int n = strs.length;

        // HashMap<String, List<String>> map = new HashMap<>();
        // for(int i = 0; i < n; i++) {
        //     String present = strs[i];
        //     char[] charArr = present.toCharArray();
        //     Arrays.sort(charArr);
        //     String sortedStr = new String(charArr);
        //     if(!map.containsKey(sortedStr)) {
        //         map.put(sortedStr, new ArrayList<>());
        //     }
        //     map.get(sortedStr).add(present);
        // }

        // for(List<String> val : map.values()) {
        //     res.add(val);
        // }

        // return res;

        
}