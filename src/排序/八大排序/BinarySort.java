package 排序.八大排序;

/**
 * @ClassName: BinarySort
 * @Description:二分查找
 * @Author: lhp
 * @Date: 2020/3/24 15:42
 * @Version: V1.0
 **/
public class BinarySort {
    public static int binarySort(int[] arr,int a){
        int low = 0;
        int high = arr.length-1;
        int mid ;
        while (low<=high){
            mid = (low+high)/2;
            if (a==arr[mid]) {
                return mid;
            } else if (a>arr[mid]){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
}
