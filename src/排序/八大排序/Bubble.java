package 排序.八大排序;

/**
 * @ClassName: Bubble
 * @Description:冒泡排序
 * @Author: lhp
 * @Date: 2020/2/26 16:15
 * @Version: V1.0
 **/
public class Bubble extends Base {
    public static int[] sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if (compare(arr[j],arr[j+1])){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={13,5,7,2,4,8};
        int[] ss = sort(arr);
        for (int i :ss){
            System.out.println(i);
        }


    }
}
