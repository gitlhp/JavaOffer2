package 排序.八大排序;

/**
 * @ClassName: ShellSort
 * @Description:希尔排序 arr -- 待排序的数组
 * <p>
 * n -- 数组的长度
 * @Author: lhp
 * @Date: 2020/2/27 11:31
 * @Version: V1.0
 **/
public class ShellSort {
    public static void shellSort(int[] arr, int n) {
        //设置循环几次间隙排序
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //这是将数组划分成gap段小数组 进行下一步插入排序
            for (int i = 0; i < gap; i++) {
                //单次插入排序
                for (int j = i + gap; j < n; j+=gap) {
                    //待插入的数
                    int insertval = arr[j];
                    //起始要比较的位置
                    int index = j - gap;
                    while (index >= 0 && insertval <= arr[index]) {
                        arr[index + gap] = arr[index];
                        index -= gap;
                    }
                    //将待插入的数插入到指定位置
                    arr[index + gap] = insertval;
                }
            }
        }
    }

//    public static void shell(int[] arr, int n) {
//        for (int gap = n / 2; gap > 0; gap /= 2) {
//            for (int i = 0; i < gap; i++) {
//                for (int j = i + gap; j < n; j++) {
//                    int insertval = arr[j];
//                    int index = j - gap;
//                    while (index >= 0 && insertval <= arr[index]) {
//
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 9, 6, 33, 5, 0,444,2,2,3,555};
        shellSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
