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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curL = queue.poll();
            TreeNode curR = queue.poll();

            if (curL == null && curR == null) {
                continue;
            }

            if (curL == null || curR == null) {
                return false;
            }

            if (curL.val != curR.val) {
                return false;
            }

            queue.add(curL.left);
            queue.add(curR.right);
            queue.add(curL.right);
            queue.add(curR.left);
        }

        return true;
    }
}

// Time O(n)
// Space O(n)