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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        ListNode temp;

        // This finds the middle node and reverses the first half at the same time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow.next; // Store the next node
            slow.next = pre; // Reverse the link
            pre = slow; // Move pre to the current slow
            slow = temp; // Move slow to the next node
        }

        // If there are an odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the reversed first half with the second half
        while (slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }
}

// Time O(n)
// Space O(1)