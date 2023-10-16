/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                break; // this means we found a cycle
            }

        }

        /* The loop is either going to break because of fast hits null or because fast == slow
            so we have to first check to make sure it is not null. Then that means we don't have a cycle
            and we don't have to do the next check
        */
        if (fast == null || fast.next == null) {
            return null;
        }

        // we make a new node and reset it to head;
        ListNode intersect = head;

        /* we can now run this loop in cofindence there is a cycle and if we start one node at head and     leave the other at the start of the cycle and increment them both by one, eventually they will both meet at the start of the cycle.
        */
        while (fast != intersect) {
            intersect = intersect.next;
            fast = fast.next;
        }

        return intersect;
        
    }
}