package 数组;

/**
 * @ClassName: SortArrayByParityII_922
 * @Description
 * @Author: lhp
 * @Date: 2020/2/28 20:12
 * @Version: V1.0
 **/
public class SortArrayByParityII_922 {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            //偶数
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }

        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
