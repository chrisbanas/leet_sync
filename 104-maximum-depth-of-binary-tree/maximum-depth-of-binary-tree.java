/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.Stack;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<Entry<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new SimpleEntry<>(root, 1));
        int maxDepth = 0;

        while (!stack.isEmpty()) {
            Entry<TreeNode, Integer> entry = stack.pop();
            TreeNode node = entry.getKey();
            int currentDepth = entry.getValue();

            if (node != null) {
                maxDepth = Math.max(maxDepth, currentDepth);
                stack.push(new SimpleEntry<>(node.left, currentDepth + 1));
                stack.push(new SimpleEntry<>(node.right, currentDepth + 1));
            }
        }

        return maxDepth;
    }
}

// Time O(n)
// Space O(n)