package ��̬�滮.q300_�����������;

/**
 * ��̬�滮 dp[i]��ʾ��i�����±����������������� o(n*log(n))
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int rs = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i] && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] += max;
            if (dp[i] > rs) {
                rs = dp[i];
            }
        }
        return rs;
    }
}
