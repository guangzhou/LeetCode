package �������.q945_ʹ����Ψһ����С����;

import java.util.Arrays;

/**
 * �������ٱ���һ�� o(n*log(n))
 */
public class Solution {

    public int minIncrementForUnique(int[] A) {
        if (A == null || A.length == 0 || A.length == 1) {
            return 0;
        }

        int rs = 0;
        Arrays.sort(A);

        int t = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= t) {
                rs = rs + t - A[i] + 1;
                A[i] = t + 1;
            }
            t = A[i];
        }
        return rs;
    }
}
