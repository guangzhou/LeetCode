package ���ı���.q144_��������ǰ�����;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * �ǵݹ鷨 o(n)
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                rs.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return rs;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        root.right = t1;
        TreeNode t2 = new TreeNode(3);
        t1.left = t2;
        new Solution().preorderTraversal(root);
    }
}
