package ���ı���.q145_�������ĺ������;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * �ǵݹ鷨 o(n)
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> rs = new LinkedList<>();
        if (root == null) {
            return rs;
        }
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            rs.addFirst(temp.val);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        return rs;
    }
}
