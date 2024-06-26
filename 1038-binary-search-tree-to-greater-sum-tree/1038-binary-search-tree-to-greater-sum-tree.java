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
    // 2M: REVERSE IN-ORDER TRAVERSAL
    public TreeNode bstToGst(TreeNode root) {
        // The nodeSum variable is passed by value to the reverseInorder method. 
        // This means that each recursive call gets its own copy of nodeSum.
        // When you update nodeSum with nodeSum += root.val;,
        // it only affects the local copy of nodeSum in that specific recursive call. 
        // The changes are not reflected in the previous calls or the overall cumulative sum.

        // int nodeSum = 0;

        // int[] nodeSum = new int[1];
        AtomicInteger nodeSum = new AtomicInteger(0);
        reverseInorder(root, nodeSum);
        return root;
    }

    private void reverseInorder(TreeNode root, /*int[]*/AtomicInteger nodeSum) {
        if (root == null) return;

        reverseInorder(root.right, nodeSum);
        // nodeSum[0] += root.val;
        // root.val = nodeSum[0];
        nodeSum.addAndGet(root.val);
        root.val = nodeSum.get();
        reverseInorder(root.left, nodeSum);
    }



    // 1M: BRUTE FORCE IN-ORDER TRAVERSAL
    // public TreeNode bstToGst(TreeNode root) {
    //     List<Integer> ls = new ArrayList();
    //     inorder(root, ls);

    //     Collections.reverse(ls);

    //     replaceValues(root, ls);
    //     return root;
    // }

    // public void inorder(TreeNode root, List<Integer> inorderTraversal) {
    //     if (root == null) return;
    //     inorder(root.left, inorderTraversal);
    //     inorderTraversal.add(root.val);
    //     inorder(root.right, inorderTraversal);
    // }

    // private void replaceValues(TreeNode root, List<Integer> ls) {
    //     if (root == null) return;

    //     replaceValues(root.left, ls);
    //     replaceValues(root.right, ls);

    //     int nodeSum = 0;
    //     for (int i : ls) {
    //         if (i > root.val) {
    //             nodeSum += i;
    //         } else {
    //             break;
    //         }
    //     }

    //     root.val += nodeSum;
    // }
}