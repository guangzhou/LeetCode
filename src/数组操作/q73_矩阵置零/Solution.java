package �������.q73_��������;

/**
 * ��ÿ�к�ÿ�еĵ�һ��Ԫ����Ϊ��ǣ��ռ临�Ӷ���o(1)��ʱ�临�Ӷ� o(m*n)
 */
public class Solution {

    public void setZeroes(int[][] matrix) {
        //��һ���Ƿ���Ҫ����
        boolean row = false;
        //��һ���Ƿ���Ҫ����
        boolean column = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        row = true;
                    }
                    if (j == 0) {
                        column = true;
                    }
                    //��i�е�һ��Ԫ�����㣬��ʾ��һ����Ҫȫ������
                    matrix[i][0] = 0;
                    //��j�е�һ��Ԫ�����㣬��ʾ��һ����Ҫȫ������
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (row) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (column) {
            for (int i = 1; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
