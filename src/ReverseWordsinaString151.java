

// import java.util.*;

public class ReverseWordsinaString151 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.reverseWords("the sky is blue"));
    }
}

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

class Solution {
    public String reverseWords(String s) {

    // ---------------------------------------------
    // Approach 1: Using List and Collections.reverse
    // Time: O(n)
    // Space: O(n)

        // List<String> words = new ArrayList<>();
        // StringBuilder word = new StringBuilder("");

        // for(char c : s.toCharArray()) {
        //     if(c != ' ') {
        //         word.append(c);
        //     } else if (word.length() > 0) {
        //         words.add(word.toString());
        //         word.setLength(0);
        //     }
        // }

        // if(word.length() > 0) {
        //     words.add(word.toString());
        // }

        // Collections.reverse(words);

        // return String.join(" ", words);

    // ---------------------------------------------
    // Approach 2: Build result from front
    // Time: O(n)
    // Space: O(1) (ignoring output string)

        String ans = "";
        String currStr = "";

        for(char c : s.toCharArray()) {
            if(c == ' ' && !currStr.equals("")) {
                ans = currStr + " " + ans;
                currStr = ""; 
            } else if(c == ' ') {
                continue;
            } else {
                currStr += c;
            }
        }

        if(!currStr.equals("")) {
            ans = currStr + " " + ans;
        }

        return ans.trim();
    }
}