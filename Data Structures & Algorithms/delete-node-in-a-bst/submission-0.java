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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val == key) {

            // case 1: leaf
            if (root.left == null && root.right == null) {
                return null;
            }
             if (root.left == null) {
                return root.right;
            }

            // case 3: only left child
            if (root.right == null) {
                return root.left;
            }

            // case 2: two children (using predecessor)
            int predVal = getTheLastNode(root.left);
            root.val = predVal;
            root.left = deleteNode(root.left, predVal);
            return root;   // 🔴 VERY IMPORTANT
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    public int getTheLastNode(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}
