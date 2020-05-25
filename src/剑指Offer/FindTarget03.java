package 剑指Offer;

/**
 * @ClassName: FindTarget03
 * @Description:二维数组查找目标值
 * @Author: lhp
 * @Date: 2020/3/9 23:15
 * @Version: V1.0
 **/
public class FindTarget03 {
    public static boolean find1(int[][] array, int target){
        if (array.length==0||array==null) {
            return false;
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
