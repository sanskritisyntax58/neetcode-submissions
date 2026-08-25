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
    public int rob(TreeNode root) {
        int[] result = robSub(root);
        return Math.max(result[0], result[1]);
    }
    
    // Returns an array of size 2:
    // index 0: max money if we rob the current node
    // index 1: max money if we do NOT rob the current node
    private int[] robSub(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        
        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        
        int[] res = new int[2];
        
        // If we rob the current node, we cannot rob its direct children
        res[0] = root.val + left[1] + right[1];
        
        // If we don't rob the current node, we can choose to rob or not rob the children
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        return res;
    }
}
