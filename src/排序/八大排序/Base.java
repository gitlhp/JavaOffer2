package 排序.八大排序;

/**
 * @ClassName: Base
 * @Description:基操
 * @Author: lhp
 * @Date: 2020/2/26 16:11
 * @Version: V1.0
 **/
public class Base {
    /**
     * 比较
     * @param n
     * @param m
     * @return
     */
    public static boolean compare(int n,int m){
        return n>m;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
