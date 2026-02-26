public class MiddleoftheLinkedList876 {
    public static void main(String[] args) {

        // Creating Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution obj = new Solution();

        ListNode middle = obj.middleNode(head);

        // Print result from middle node
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}

// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
    public ListNode middleNode(ListNode head) {

        // ---------------------------------------------
        // Approach 1: Brute Force (Two Traversals)
        // Time: O(n)
        // Space: O(1)

        // int count = 0;
        // ListNode temp = head;

        // while(temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // int mid = count / 2;

        // temp = head;
        // while(mid-- > 0) {
        //     temp = temp.next;
        // }

        // return temp;

        // ---------------------------------------------
        // Approach 2: Optimal (Slow & Fast Pointer)
        // Time: O(n)
        // Space: O(1)

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}