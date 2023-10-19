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

    if (list1 == null && list2 == null) {
      return null;
    } else if (list1 == null && list2 != null) {
      return list2;
    } else if (list2 == null && list1 != null) {
      return list1;
    }

    ListNode current1 = list1;
    ListNode current2 = list2;

    ListNode output = new ListNode();
    ListNode dummy = output;

    while (current1 != null && current2 != null) {
      if (current1.val <= current2.val) {
        dummy.next = current1;
        current1 = current1.next;
      } else {
        dummy.next = current2;
        current2 = current2.next;
      }
      dummy = dummy.next;
    }

    if (current1 == null) {
      dummy.next = current2;
    } else {
      dummy.next = current1;
    }

    return output.next;

  }

}