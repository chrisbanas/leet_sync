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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preOrder = new ArrayList<>();

        if (root == null) {
            return preOrder;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.offerFirst(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pollFirst();
            preOrder.add(temp.val);

            if (temp.right != null) {
                stack.offerFirst(temp.right);
            }
            if (temp.left != null) {
                stack.offerFirst(temp.left);
            }

        }

        return preOrder;

    }
}