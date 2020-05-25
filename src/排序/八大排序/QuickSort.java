package 排序.八大排序;

/**
 * @ClassName: QuickSort
 * @Description:快速排序
 * @Author: lhp
 * @Date: 2020/2/26 21:25
 * @Version: V1.0
 **/
public class QuickSort extends Base {
    public static void QuickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low > high) {
            return;
        }
        int index = getIndex(arr,low,high);
        QuickSort(arr,0,index-1);
        QuickSort(arr,index+1,high);
    }

    //返回每次确定的元素的位置，为下次递归划分边界
    public static int getIndex(int[] arr, int low, int high) {
        //记录基准数据，起始数据
        int val = arr[low];
        while (low < high) {
            //从右边起始比基准数据大的吧不动，指针迁移
            while (low < high && arr[high] >= val) {
                high--;
            }
            //交换插入数据
            arr[low] = arr[high];
            while (low < high && arr[low] <= val) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = val;
        return low;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 6, 9, 8, 7, 7};
        QuickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
