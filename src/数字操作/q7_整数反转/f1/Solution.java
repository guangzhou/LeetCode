package ���ֲ���.q7_������ת.f1;

/**
 * ת��String o(n) �����쳣�ж��Ƿ����
 */
public class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        String rs = "";
        boolean f = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                f = true;
            } else {
                rs += s.charAt(i);
            }
        }
        try {
            return f ? Integer.parseInt(rs) * (-1) : Integer.parseInt(rs);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1234));
    }
}
