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

//  Recursive DFS Postorder Traversal Template:

//     If the tree is empty, return.
//     Traverse the left subtree: dfs(root.left).
//     Traverse the right subtree: dfs(root.right).
//     Handle the root.

class Solution {
    private int moves = 0;
    // There are three main traversal types for DFS, one of which is a postorder traversal
    // DFS USING POSTORDER TRAVERSAL
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftCoins = dfs(root.left);
        int rightCoins = dfs(root.right);

        moves += Math.abs(leftCoins) + Math.abs(rightCoins);
        return root.val - 1 + leftCoins + rightCoins;
    }
}