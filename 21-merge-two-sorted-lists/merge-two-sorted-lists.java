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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;

        ListNode output = new ListNode();
        ListNode prev = output;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                prev.next = cur1;
                cur1 = cur1.next;
            } else {
                prev.next = cur2;
                cur2 = cur2.next;
            }
            prev = prev.next;
        }

        prev.next = cur1 == null ? cur2 : cur1;
        
        return output.next;
    }
}