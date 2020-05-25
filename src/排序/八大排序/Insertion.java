package 排序.八大排序;

/**
 * @ClassName: Insertion
 * @Description:插入排序
 * @Author: lhp
 * @Date: 2020/2/26 16:36
 * @Version: V1.0
 **/
public class Insertion extends Base {
    public static int[] sort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            //记录将要插入的值
            int insert = arr[i];
            //第一次待比较的位置也就是他的上一个
            int index = i -1;
            while (index>=0&&insert<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            //将插入的数插入到对应位置
            arr[index+1]=insert;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={6,2,5,7,8};
        int[] arrnew = Insertion.sort(arr);
        for(int i :arrnew){
            System.out.println(i);
        }
    }
}
