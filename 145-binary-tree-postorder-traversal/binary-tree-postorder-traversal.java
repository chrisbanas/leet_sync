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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> postOrder = new ArrayList<>();
        postorderTraversal(root, postOrder);
        return postOrder;
        
    }

    public void postorderTraversal(TreeNode root, List<Integer> postOrder) {
        
        if (root == null) {
            return;
        }

        postorderTraversal(root.left, postOrder);
        postorderTraversal(root.right, postOrder);
        postOrder.add(root.val);

    }

}