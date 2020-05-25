package 排序.八大排序;

/**
 * @ClassName: Selection
 * @Description:选择排序 最后交换
 * @Author: lhp
 * @Date: 2020/2/27 15:22
 * @Version: V1.0
 **/
public class Selection {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};

        Selection.sort(a);

        for (int i : a) {

            System.out.println(i);

        }

    }
}
