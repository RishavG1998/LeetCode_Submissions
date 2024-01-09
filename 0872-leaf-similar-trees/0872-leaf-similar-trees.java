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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafList1 = new ArrayList<>();
        List<Integer> leafList2 = new ArrayList<>();

        dfs(root1, leafList1);
        dfs(root2, leafList2);

        return leafList1.equals(leafList2);
    }

    public void dfs(TreeNode root, List<Integer> leafList) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafList.add(root.val);
            return;
        }

        dfs(root.left, leafList);
        dfs(root.right, leafList);
    }
}