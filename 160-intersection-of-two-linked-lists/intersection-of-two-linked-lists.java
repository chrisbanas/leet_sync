/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    ListNode currentA = headA;
    ListNode currentB = headB;

    while (currentA != currentB) {
      currentA = currentA == null ? headB : currentA.next;
      currentB = currentB == null ? headA : currentB.next;
    }

    return currentA;
  }
}