package ˫ָ�����.q42_����ˮ;

/**
 * ������o(n^2) �ҳ�ÿ��Ԫ�أ����ӣ������ˮ��������ǰ�洢���߶����飨��������ң���������һ���Ż�Ϊo(n)
 */
public class Solution {

    public int trap(int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}
