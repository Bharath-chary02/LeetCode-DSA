public class RotateList61 {
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        int k = 2;

        Solution sol = new Solution();
        ListNode result = sol.rotateRight(head, k);

        printList(result);
    }

    // Utility method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

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

    // ------------------------------------------------
    // Approach: Circular Linked List Rotation
    //
    // 1. Find length and tail of the list
    // 2. Reduce k using k % length
    // 3. Connect tail to head (make circular)
    // 4. Find new tail at (len - k - 1)
    // 5. Break the circle
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode tail = null;
        int len = 0;

        while(temp != null) {
            tail = temp;
            temp = temp.next;
            len++;
        }

        k = k % len;

        if(k == 0) {
            return head;
        }

        temp = head;

        tail.next = head;

        int nt = len - k - 1;

        while(nt-- > 0) {
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}