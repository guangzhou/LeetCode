package �������������.q98_��֤����������.f2;

/**
 * Ѱ�����½�ݹ� o(n)
 */
public class Solution {
    public boolean valid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        int val = root.val;

        if (min != null && val <= min) {
            return false;
        }
        if (max != null && val >= max) {
            return false;
        }

        if (!valid(root.left, min, val)) {
            return false;
        }
        if (!valid(root.right, val, max)) {
            return false;
        }
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }
}
