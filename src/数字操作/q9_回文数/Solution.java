package ���ֲ���.q9_������;

/**
 * ��ת����String ��תһ�������o(log(n))
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int rs = 0;
        while (rs < x / 10) {
            int y = x % 10;
            x = x / 10;
            rs = rs * 10 + y;
            if (rs == x) {
                return true;
            } else if (x / 10 == rs) {
                return true;
            }
        }
        return false;
    }
}
