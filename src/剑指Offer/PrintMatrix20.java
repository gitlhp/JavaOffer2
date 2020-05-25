package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: PrintMatrix20
 * @Description：顺时针打印矩阵
 * @Author: lhp
 * @Date: 2020/3/10 17:40
 * @Version: V1.0
 **/
public class PrintMatrix20 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0||matrix==null){
            return list;
        }
        //记录多少行
        int r1 = 0,r2 = matrix.length-1;
        //记录多少列
        int c1 = 0,c2 = matrix[0].length-1;
        while (r1<=r2&&c1<=c2){
            //1.从左向右读到头
            for(int i=c1;i<=c2;i++){
                list.add(matrix[r1][i]);
            }
            //2.从当前读的下一行开始从上向下读到底
            for (int i = r1+1; i <=r2; i++) {
                list.add(matrix[i][c2]);
            }
            //避免重复判断
            if (r1<r2&&c1<c2){
                //3.从当前读的列左边的一列从右到左读到第二列
                for (int i = c2-1; i >r1 ; i--) {
                    list.add(matrix[r2][i]);
                }
                //4.从当前读的行的最左边起从下往上读到第二行
                for (int i = r2; i >r1 ; i--) {
                    list.add(matrix[i][c1]);
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;
        }
        return list;
    }

    public static void main(String[] args) {
        PrintMatrix20 printMatrix20 = new PrintMatrix20();
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> list = printMatrix20.printMatrix(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
