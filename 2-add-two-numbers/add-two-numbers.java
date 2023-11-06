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
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode output = new ListNode(0);
        ListNode prev = output;

        int carry = 0;

        while (cur1 != null || cur2 != null || carry == 1) {
            int temp = (cur1 != null ? cur1.val : 0) + (cur2 != null ? cur2.val : 0) + carry;
            carry = temp > 9 ? 1 : 0;
            prev.next = new ListNode(temp % 10);
            cur1 = cur1 != null ? cur1.next : null;
            cur2 = cur2 != null ? cur2.next : null;
            prev = prev.next;
        }

        return output.next;
    }
}

// Time O(l1.size() + l2.size()) -> O(m + n)
// Space O(length of the longer list) -> O(n)