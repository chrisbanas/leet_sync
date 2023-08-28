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
    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            boolean siblings = false;
            boolean cousins = false;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // We hit the sibling marker so we can reset it to false as we are entering a new pair of siblings
                if (current == null) {
                    siblings = false;
                } else {
                    if (current.val == x || current.val == y) {
                        // sets both siblings and cousins flag to true since we found one
                        if (!cousins) {
                            siblings = true;
                            cousins = true;
                        } else {
                            // Return false because the sibling flag was still true so no cousins
                            return !siblings;
                        }
                    }

                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                    // This is to seperate pairs of siblings
                    queue.offer(null);
                }
            }

            /* After the end of a level if `cousins` is set to true this means we found only one node at    this level and since the tree is all unique nodes there is no point in check further down
            */ 
            if (cousins) {
                return false;
            }

        }

        return false;
        
    }
}