package ��̬�滮.q70_��¥��;

/**
 * ��̬�滮 dp[i]��ʾ�����i�׵ķ�������dp[i]=dp[i?1]+dp[i?2] o(n)
 */
public class Solution {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
