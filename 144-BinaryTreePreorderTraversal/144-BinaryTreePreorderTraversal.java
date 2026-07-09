// Last updated: 7/9/2026, 9:16:45 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ll = new ArrayList<>();
        if (root == null) return ll;
        ll.add(root.val);
        ll.addAll(preorderTraversal(root.left));
       
        ll.addAll(preorderTraversal(root.right));
        return ll;    
    }
}