package LeetCode.剑指offer;

/**
 * @ClassName: FindNumberIn2DArray2
 * @Description：二维数组中的查找
 * @Author: lhp
 * @Date: 2020/4/15 10:55
 * @Version: V1.0
 **/
public class FindNumberIn2DArray2 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
