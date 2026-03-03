public class PalindromeLinkedList234 {
    public static void main(String[] args) {

        // Creating list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);

        System.out.println(result); // true
    }
}
 
// Example 1:

// Input: head = [1,2,2,1]
// Output: true

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
    // Approach 1: Reverse Second Half (Two Pointers)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;

        ListNode mid = null;
        if(fast == null) {
            mid = slow.next;
        } else {
            mid = slow;
        }

        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev != null) {
            if(fast.val != prev.val) {
                return false;
            }
            prev = prev.next;
            fast = fast.next;
        }

        return true;
    }
}