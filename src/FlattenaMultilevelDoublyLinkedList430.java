public class FlattenaMultilevelDoublyLinkedList430 {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        Solution sol = new Solution();
        Node result = sol.flatten(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

// Example 1:

// Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
// Output: [1,2,3,7,8,11,12,9,10,4,5,6]
// Explanation: The multilevel linked list in the input is shown.
// After flattening the multilevel linked list it becomes:

// Definition for singly-linked list.
class Node {
    int val;
     Node next;
     Node child;
     Node prev;
     Node(int x) {
         val = x;
         next = null;
     }
 }

class Solution {

    public static Node helper(Node head) {
        if(head == null) {
            return head;
        }

        Node curr = head;

        while(curr != null) {
            if(curr.child != null) {
                Node next = curr.next;
                Node pres = helper(curr.child);
                curr.next = pres;
                curr.next.prev = curr;
                curr.child = null;

                while(curr.next != null) {
                    curr = curr.next;
                }

                if(next != null) {
                    curr.next = next;
                    next.prev = curr;
                }
            }

            curr = curr.next;
        }

        return head;
    }

    public Node flatten(Node head) {

        // ---------------------------------------------
        // Approach 1: Recursive DFS
        // Time: O(n)
        // Space: O(n)  (due to recursion stack)

        return helper(head);
    }
}