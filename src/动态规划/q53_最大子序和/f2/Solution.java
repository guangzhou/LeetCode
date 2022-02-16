package ��̬�滮.q53_��������.f2;

/**
 * ��̬�滮 dp[i]��ʾ��nums[i]��β���������� o(n)
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        int rs = dp[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = dp[i - 1] + nums[i];
            dp[i] = Math.max(nums[i],temp);
            rs = Math.max(rs, dp[i]);
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2}));
    }
}
