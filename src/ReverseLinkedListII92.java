public class ReverseLinkedListII92 {
    public static void main(String[] args) {

        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        Solution sol = new Solution();
        ListNode result = sol.reverseBetween(head, 2, 4);

        // Print result
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

// Example 1:

// Input: head = [1,2,3,4,5], left = 2, right = 4
// Output: [1,4,3,2,5]

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left >= right) {
            return head;
        }

        // --------------------------------------------------
        // Approach 1: Direct Sublist Reversal
        // Time: O(N)
        // Space: O(1)

        // ListNode temp = head;
        // ListNode ltemp = null;
        // ListNode prev = null;
        // ListNode fprev = null;

        // int count = 1;
        // while(count <= right) {
        //     if(count == left) {
        //         ltemp = temp;
        //     }
        //     if(left > 1 && count == (left - 1)) {
        //         fprev = temp;
        //     }
            
        //     temp = temp.next;
        //     count++;
        // }

        // prev = null;
        // ListNode curr =ltemp;
        // ListNode next = null;

        // count = right - left;

        // while(count-- >= 0) {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // if(left != 1) {
        //     fprev.next = prev;
        // }
        // ltemp.next = temp;

        // if(left == 1) {
        //     return prev;
        // }

        // return head;

        
    }
}