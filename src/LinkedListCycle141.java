public class LinkedListCycle141 {
    public static void main(String[] args) {

        // create nodes
        ListNode head = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        // connect list
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        // create cycle (tail connects to node with value 2)
        n4.next = n2;

        Solution sol = new Solution();

        System.out.println(sol.hasCycle(head)); // true
    }
}

// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

// Definition for singly-linked list.
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

class Solution {

    // ---------------------------------------------
    // Approach 1: Floyd Cycle Detection (Optimal)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }

        return false;
    }
}