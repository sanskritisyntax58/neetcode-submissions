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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        // Base Case
        if (root == null) {
            return null;
        }

        // Post-Order Traversal: Process children first
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        // Check if the current node has become a target leaf node
        if (root.left == null && root.right == null && root.val == target) {
            return null; // Delete this node by returning null to its parent
        }

        return root; // Keep this node
    }
}
