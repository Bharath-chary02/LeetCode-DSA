public class ReverseNodesink_Group25 {
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));

        int k = 2;

        Solution sol = new Solution();
        ListNode result = sol.reverseKGroup(head, k);

        printList(result);
    }

    // Utility function to print linked list
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
// Output: [2,1,4,3,5]

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
    // Approach: Recursive K Group Reversal
    //
    // 1. Check if k nodes exist ahead.
    // 2. Recursively reverse the remaining list.
    // 3. Reverse the current k nodes.
    // 4. Attach them to the recursively reversed list.
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n/k) recursion stack

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int c = 0;
        
        while(c < k) {
            if(temp == null) {
                return head;
            }
            temp = temp.next;
            c++;
        }

        ListNode prevNode = reverseKGroup(temp, k);

        c = 0;
        temp = head;
        while(c < k) {
            ListNode next = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = next;
            c++;
        }

        return prevNode;
    }
}