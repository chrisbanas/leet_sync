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
    public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode current = head;

    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        current.next = current.next.next; // If this is iteration one we are current is still on the head, but we reset its next pointer to be pointing to the third value.
      } else {
        current = current.next; // Otherwise, move current up to the next because the values are different.
      }
    }

    return head;

  }
}

// Time O(head.size()) -> O(n)
// Space O(1)