package 排序.八大排序;

/**
 * @ClassName: HeapSortMaxAndMin
 * @Description：堆排序
 * @Author: lhp
 * @Date: 2020/4/5 18:30
 * @Version: V1.0
 **/
public class HeapSortMaxAndMin {
    public static void main(String[] args) {

    }

    /**
     * 构建堆
     *
     * @param array
     */
    public static void buildArrayToHeap(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }
        //递推公式：int root = 2*i int left=2*i+1 int left=2*i+2
        int cursor = array.length / 2;
        //这样循环下可以完成一次排序
        for (int i = cursor; i >= 0; i--) {
            buildMaxHeap(array,array.length,i);
        }
    }

    /**
     * 大顶堆
     *
     * @param array
     * @param heapSize
     * @param index
     */
    public static void buildMaxHeap(int[] array, int heapSize, int index) {
        int left = index * 2 + 1;//左子节点
        int right = index * 2 + 2;//右子节点
        int maxValue = index;//暂定在该位置的是最大值
        // 如果左子节点的值，比当前最大的值大，就把最大值的位置换成左子节点的位置
        if (left < heapSize && array[left] > array[maxValue]) {
            maxValue = left;
        }
        // 如果右子节点的值，比当前最大的值大，就把最大值的位置换成右子节点的位置
        if (right < heapSize && array[right] > array[maxValue]) {
            maxValue = right;
        }
        if (maxValue != index) {
            swap(array, index, maxValue);
            // 交换完位置后还需要判断子节点是否打破了最大堆的性质。最大堆性质：两个子节点都比父节点小。
            buildMaxHeap(array, heapSize, maxValue);//递归出口就是这个if
        }
    }

    //小顶堆
    public static void buildMinHeap(int[] array, int heapSieze, int index) {
        int left = index * 2 + 1; // 左子节点
        int right = index * 2 + 2; // 右子节点
        int maxValue = index; // 暂时定在Index的位置就是最小值
        // 如果左子节点的值，比当前最小的值小，就把最小值的位置换成左子节点的位置
        if (left < heapSieze && array[left] < array[maxValue]) {
            maxValue = left;
        }
        // 如果右子节点的值，比当前最小的值小，就把最小值的位置换成左子节点的位置
        if (right < heapSieze && array[right] < array[maxValue]) {
            maxValue = right;
        }
        // 如果不相等说明这个子节点的值有比自己小的，位置发生了交换了位置
        if (maxValue != index) {
            swap(array, index, maxValue); // 就要交换位置元素
            // 交换完位置后还需要判断子节点是否打破了最小堆的性质。最小性质：两个子节点都比父节点大。
            buildMinHeap(array, heapSieze, maxValue);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
