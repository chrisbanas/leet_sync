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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecursive(l1, l2, 0);
    }

    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode currentNode = new ListNode(sum % 10); // Create a new node with the digit value of sum
        currentNode.next = addTwoNumbersRecursive(
                l1 != null ? l1.next : null,
                l2 != null ? l2.next : null,
                sum / 10); // Carry is sum divided by 10

        return currentNode;
    }
}

// Time & Space O(n)