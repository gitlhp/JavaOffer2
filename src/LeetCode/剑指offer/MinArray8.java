package LeetCode.剑指offer;

/**
 * @ClassName: MinArray8
 * @Description:旋转最小的数字
 * @Author: lhp
 * @Date: 2020/4/15 18:13
 * @Version: V1.0
 **/
public class MinArray8 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[i + 1] && i + 1 < numbers.length) {
                return numbers[i + 1];
            }
        }
        return -1;
    }
    //二分查找
    public int minArray1(int[] numbers) {
        if (numbers==null||numbers.length==0) {
            return -1;
        }
        int left =0;
        int right = numbers.length-1;
        while (left<right){
            int mid = left+right/2;
            if (numbers[mid]>numbers[right]){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return numbers[left];
    }

}
