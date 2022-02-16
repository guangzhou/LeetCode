package ����ָ�����.q202_������;

/**
 * ����ָ�룬˼��ͬq141�ж��Ƿ��л����ÿ���ָ���ҳ�ѭ����ֹ���� o(n)
 */
public class Solution {

    private int bitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        } while (slow != fast);

        return slow == 1;
    }
}
