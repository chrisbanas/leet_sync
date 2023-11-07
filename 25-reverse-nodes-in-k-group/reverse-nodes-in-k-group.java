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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {
            ListNode tail = cur;
            int i = 0;

            while (cur != null && i < k) {
                cur = cur.next;
                i++;
            }

            if (i != k) {
                prev.next = tail;
            } else {
                prev.next = reverse(tail, k);
                prev = tail;
            }
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (k-- > 0) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head.next = current;
        return prev;
    }
}
// Time O(n)
// Space O(1)