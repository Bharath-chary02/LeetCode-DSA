public class AddTwoNumbers2 {
    public static void main(String[] args) {

        // Creating l1 = [2,4,3]
        ListNode l1 = new ListNode(2,
                        new ListNode(4,
                        new ListNode(3)));

        // Creating l2 = [5,6,4]
        ListNode l2 = new ListNode(5,
                        new ListNode(6,
                        new ListNode(4)));

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

// Example 1:

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // --------------------------------------------------
        // Approach: Digit-by-Digit Addition (Elementary Math Simulation)
        // Time Complexity: O(max(n, m))
        // Space Complexity: O(max(n, m))

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        
        while(temp1 != null || temp2 != null) {
            int v1 = temp1 != null ? temp1.val : 0;
            int v2 = temp2 != null ? temp2.val : 0;
            int sum = v1 + v2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(digit);
            curr = curr.next;
            if(temp1 != null) {
                temp1 = temp1.next;
            }
            if(temp2 != null) {
                temp2 = temp2.next;
            }
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;

    }
}