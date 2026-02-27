public class ReverseLinkedList206 {
    public static void main(String[] args) {
        
    }
}

// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

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

    public static ListNode reverse(ListNode temp) {
        if(temp == null || temp.next == null) {
            return temp;
        }

        ListNode rev = reverse(temp.next);
        temp.next.next = temp;
        temp.next = null;

        return rev;
    }

    public ListNode reverseList(ListNode head) {

        // ---------------------------------------------
        // Approach 1: Iterative Pointer Reversal
        // Time: O(n)
        // Space: O(1)

        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next = null;

        // while(curr != null) {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // head = prev;

        // return head;

        // ---------------------------------------------
        // Approach 2: Recursive Reversal
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        ListNode temp = head;

        return reverse(temp);
    }
}