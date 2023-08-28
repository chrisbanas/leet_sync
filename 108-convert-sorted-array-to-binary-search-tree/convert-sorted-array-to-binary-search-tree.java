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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            TreeNode root = new TreeNode();
            return root;
        }

        int left = 0;
        int right = nums.length - 1;

        return buildTreeWithBinarySearch(nums, left, right);

    }

    public TreeNode buildTreeWithBinarySearch(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // Each recursive stack is like building a new tree
        int mid = left + ((right - left) / 2);
        TreeNode root = new TreeNode(nums[mid]);

        // Build the left side
        root.left = buildTreeWithBinarySearch(nums, left, mid - 1);

        // Build the right side
        root.right = buildTreeWithBinarySearch(nums, mid + 1, right);

        return root;

    }
}