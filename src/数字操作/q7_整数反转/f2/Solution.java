package ���ֲ���.q7_������ת.f2;

/**
 * ���ࣨ�ж��Ƿ�����ж��ַ�ʽ�� o(log(n))
 */
public class Solution {
    public int reverse(int x) {
        int rs = 0;
        while (true) {
            int y = x % 10;
            x = x / 10;
            if (rs * 10 / 10 != rs) {
                return 0;
            }
            rs = rs * 10 + y;
            if (x == 0) {
                break;
            }
        }
        return rs;
    }
}
