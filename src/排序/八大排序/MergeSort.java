package 排序.八大排序;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * @ClassName: MergeSort
 * @Description:归并排序
 * @Author: lhp
 * @Date: 2020/2/27 13:50
 * @Version: V1.0
 **/
public class MergeSort {
    public static void mergeSort(int[] arr) {
        //递归出口
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        //计算中间值，保证算法不会溢出
        int mid = low + ((high - low) >> 1);
        //对左边排序
        mergeSort(arr, low, mid);
        //对右边排序
        mergeSort(arr, mid + 1, high);
        //归并另个有序的子序列
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        //建立临时数组
        int[] temp = new int[high - low + 1];
        int left = low;//左侧指针从low开始
        int right = mid + 1;//右侧指针从mid+1开始
        int index = 0;//用于临时数组
//        int index1 = low;//用于临时数组
        //比较两个子序列大小写入临时数组
        while (left < mid && right < high) {
            if (arr[left] < arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        //剩余元素 考虑左右子序列数组元素不一样多
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (right <= high) {
            temp[index++] = arr[right++];
        }
        //将临时数组的数组复制到原数组
        // 重新赋值给arr对应的区间。

        for (int i = 0; i < temp.length; i++) {

            arr[low + i] = temp[i];

        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};
        System.out.print("排序前:  ");
        print(arr);
        mergeSort(arr);
        System.out.print("排序后:  ");
        print(arr);
    }

    public static void print(int[] arr) {
        if (arr == null) {
            return;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



