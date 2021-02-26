import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal_26 {
}

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

class Solution_26 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorder(root, list);
        return list;
    }

    void preorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
