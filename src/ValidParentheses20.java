import java.util.*;

public class ValidParentheses20 {
    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "()[]{}";
        System.out.println(obj.isValid(s)); // true

        s = "(]";
        System.out.println(obj.isValid(s)); // false
    }
}

class Solution {

    // ---------------------------------------------
    // Approach 1: Stack
    // Time: O(n)
    // Space: O(n)

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() <= 1) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if(!st.isEmpty()) {
                    if((ch == ')' && st.peek() == '(')
                    || (ch == ']' && st.peek() == '[')
                    || (ch == '}' && st.peek() == '{')) {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if(st.isEmpty()) {
            return true;
        }

        return false;
    }
}