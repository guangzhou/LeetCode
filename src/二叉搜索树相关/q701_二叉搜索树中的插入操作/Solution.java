package �������������.q701_�����������еĲ������;

/**
 * �ݹ飨���ڲ�����������С�ڲ����������� o(n)
 */
public class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        TreeNode temp = root;
        if (root == null) {
            return node;
        }
        if (val >= root.val) {
            if (root.right == null) {
                root.right = node;
            } else {
                insertIntoBST(root.right, val);
            }
        } else {
            if (root.left == null) {
                root.left = node;
            } else {
                insertIntoBST(root.left, val);
            }
        }
        return temp;
    }
}
