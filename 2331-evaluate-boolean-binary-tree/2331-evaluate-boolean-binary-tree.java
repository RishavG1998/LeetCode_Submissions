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
    public boolean evaluateTree(TreeNode root) {
        // 3M: SWITCH
        switch(root.val) {
            case 0:
            case 1:
                return root.val == 1;
            case 2:
                return evaluateTree(root.left) || evaluateTree(root.right);
            default:
                return evaluateTree(root.left) && evaluateTree(root.right);
        }


        // 2M: ITERATIVE APPROACH
        // Deque<TreeNode> stack = new LinkedList<>();
        // Stack<TreeNode> stack = new Stack<>();
        // Map<TreeNode, Boolean> value = new HashMap<>();
        // stack.push(root);

        // while(!stack.isEmpty()) {
        //     TreeNode node = stack.pop();

        //     // Leaf Node
        //     if (node.left == null && node.right == null) {
        //         value.put(node, node.val == 1);
        //     }
        //     // Non-Leaf Node
        //     else {
        //         // Children Visited
        //         if (value.containsKey(node.left) && value.containsKey(node.right)) {
        //             if (node.val == 2) {
        //                 value.put(node, value.get(node.left) || value.get(node.right));
        //             }
        //             if (node.val == 3) {
        //                 value.put(node, value.get(node.left) && value.get(node.right));
        //             }
        //         }
        //         // Otherwise
        //         else {
        //             stack.push(node);
        //             stack.push(node.left);
        //             stack.push(node.right);
        //         }
        //     }
        // }
        // return value.get(root);

        // 1M: RECURSIVE
        // if (root.left == null && root.right == null) 
        //     return root.val == 0 ? false : true;
        // boolean left = evaluateTree(root.left);
        // boolean right = evaluateTree(root.right);
        // if (root.val == 2) {
        //     return left || right;
        // }
        // if (root.val == 3) {
        //     return left && right;
        // }
        // return false;
    }
}