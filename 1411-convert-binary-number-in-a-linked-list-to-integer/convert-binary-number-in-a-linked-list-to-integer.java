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
    public int getDecimalValue(ListNode head) {
        int converted = 0;
        ListNode current = head;

        while (current != null) {
            converted *= 2; //ans=ans<<1 (in bit manipulation)
            converted += current.val;
            current = current.next;
        }

        return converted;
    }
}

// Time O(list.size()) -> O(n)
// Space O(1)