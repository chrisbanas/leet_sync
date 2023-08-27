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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inOrder = new ArrayList<>();

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.offerFirst(current);
                current = current.left;
            } else {
                current = stack.pollFirst();
                inOrder.add(current.val);
                current = current.right;
            }
        }

        return inOrder;
    }
}