public class LinkedListCycleII142 {
    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(-4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n1; // cycle at index 1

        Solution sol = new Solution();
        ListNode ans = sol.detectCycle(head);

        System.out.println(ans.val);
    }
}

// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.

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
    // Approach: Floyd’s Cycle Detection Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }

        if(flag) {
            slow = head;
            while(fast != null) {
                if(fast == slow) {
                    return fast;
                }
                slow = slow.next;
                fast = fast.next;
            }
        }

        return null;
        
    }
}