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
    public int goodNodes(TreeNode root) {
    int max=Integer.MIN_VALUE;
    int count=dfs(root,max);
    return count;
    }
    public int dfs(TreeNode r,int maxa){
    int c=0;
    if(r==null)return 0;
    if(r.val>=maxa){
    maxa=r.val;
    c++;}
    int left=dfs(r.left,maxa);
    int right=dfs(r.right,maxa);
    return c+left+right;
    }
}
