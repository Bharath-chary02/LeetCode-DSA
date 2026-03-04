import java.util.*;

public class CopyListwithRandomPointer138 {
    public static void main(String[] args) {

        // Creating nodes
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // Connecting next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Connecting random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Solution sol = new Solution();
        Node copiedHead = sol.copyRandomList(n1);

        // Print copied list
        Node temp = copiedHead;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Node: " + temp.val + " Random: " + randomVal);
            temp = temp.next;
        }
    }
}

// Example 1:

// Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
// Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {

    // --------------------------------------------------
    // Approach: HashMap (Two Pass Solution)
    //
    // Step 1: Create copy nodes and store mapping
    //         originalNode -> copiedNode in HashMap
    //
    // Step 2: Use the map to assign random pointers
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public Node copyRandomList(Node head) {

        if(head == null) {
            return null;
        }

        Node oldtemp = head.next;
        Node newtemp = new Node(head.val);
        Node newhead = newtemp;

        HashMap<Node, Node> map = new HashMap<>();

        map.put(head, newtemp);

        while(oldtemp != null) {
            Node copy = new Node(oldtemp.val);
            map.put(oldtemp, copy);
            newtemp.next = copy;

            oldtemp = oldtemp.next;
            newtemp = newtemp.next;
        }

        oldtemp = head;
        newtemp = newhead;

        while(oldtemp != null) {
            newtemp.random = map.get(oldtemp.random);
            oldtemp = oldtemp.next;
            newtemp = newtemp.next;
        }

        return newhead;
    }
}