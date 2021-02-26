import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InorderTraversal_27 {
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
class Solution_27 {
    private Object ArrayList;

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode ptr = root;
        while (ptr != null || !stack.isEmpty()){
            //这一部分是左子树为空的节点
            while (ptr != null){
                stack.push(ptr);//过程中不断入栈
                ptr = ptr.left;
            }

            ptr = stack.pop();//这个节点的左子树为空
            list.add(ptr.val);//访问

            ptr = ptr.right;//访问这个节点的右子树，一个一个的栈
        }

        return list;
    }
}
