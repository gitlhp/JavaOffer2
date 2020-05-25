package 数组;

/**
 * @ClassName: FlipAndInvertImage_832
 * @Description:反转图像
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * @Author: lhp
 * @Date: 2020/2/28 11:24
 * @Version: V1.0
 **/
public class FlipAndInvertImage_832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i <A.length ; i++) {
            int len = A[i].length;
            for (int j = 0; j <len/2; j++) {
                int temp = A[i][j];
                A[i][j]=A[i][len-j-1]^=1;
                A[i][len-j-1] = temp^=1;
            }
        }
//        for (int i = 0; i <A.length ; i++) {
//            int len = A[i].length;
//            for (int j = 0; j <len; j++) {
//             if (A[i][j]==0){
//                 A[i][j]=1;
//             }else {
//                 A[i][j]=0;
//             }
//
//            }
//        }
        return A;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] newarr= FlipAndInvertImage_832.flipAndInvertImage(arr);
        for (int[] ints : newarr) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

    }
}
