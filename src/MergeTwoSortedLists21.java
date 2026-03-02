public class MergeTwoSortedLists21 {
    public static void main(String[] args) {

        // list1 = [1,2,4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // list2 = [1,3,4]
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        Solution obj = new Solution();
        ListNode result = obj.mergeTwoLists(l1, l2);

        // Print result
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

// Example 1:

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

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
    // Approach: Iterative Merge (Two Pointer Technique)
    // Time Complexity: O(n + m)
    // Space Complexity: O(1)

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(-1);
        ListNode temp = merge;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return merge.next;
    }
}