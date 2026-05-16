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
    public boolean isBalanced(TreeNode root) {
       if (root == null) {
            return true;
        }

        // height of left subtree
        int leftHeight = height(root.left);

        // height of right subtree
        int rightHeight = height(root.right);

       
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // recursively check left and right subtree
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }
}
