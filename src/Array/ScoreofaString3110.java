package Array;
public class ScoreofaString3110 {
    public static void main(String[] args) {
        String s = "hello";

        Solution sol = new Solution();

        System.out.println(sol.scoreOfString(s));
    }
}

// Example 1:

// Input: s = "hello"

// Output: 13

// Explanation:

// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            count += Math.abs(arr[i] - arr[i + 1]);
        }
        return count;
    }
}