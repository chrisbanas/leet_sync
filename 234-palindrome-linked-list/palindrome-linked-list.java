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
        return isPalindromeRecursive(head, new ListNode[]{head});
    }
    
    public boolean isPalindromeRecursive(ListNode end, ListNode[] start) {
        // Base case
        if (end == null) {
            return true;
        }

        // Second check for efficiency. If the remaining list is not a palindrome, no need to keep going.
        if (!isPalindromeRecursive(end.next, start)) {
            return false;
        }

        // Check if current nodes are equal.
        boolean isEqual = (start[0].val == end.val);

        // Move the start pointer forward.
        start[0] = start[0].next;

        return isEqual;
    }
}