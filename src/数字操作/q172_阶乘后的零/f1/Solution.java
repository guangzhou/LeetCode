package ���ֲ���.q172_�׳˺����.f1;

/**
 * ������ֱ�ӱ�����o(n)��ʱ��
 */
public class Solution {
    public int trailingZeroes(int num) {
        int rs = 0;
        for (int i = 1; i <= num; i++) {
            int j = i;
            while (j % 5 == 0) {
                rs++;
                j /= 5;
            }
        }
        return rs;
    }
}
