package ���ֲ���.q172_�׳˺����.f2;

/**
 * ���ڷ���һ��Ѱ��5���ֵĹ���o(log(n))
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
