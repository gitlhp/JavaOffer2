package 剑指Offer;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: ReOrderArray14
 * @Description:将数组中的奇数放在偶数前
 * @Author: lhp
 * @Date: 2020/3/10 15:12
 * @Version: V1.0
 **/
public class ReOrderArray14 {
    public void reOrderArray1(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public void reOrderArray(int [] array) {
        Queue<Integer> jishu = new LinkedList<>();
        Queue<Integer> oushu = new LinkedList<>();
        for (int i =0;i<array.length;i++){
            if (array[i]%2==0) {
                oushu.add(array[i]);
            }else {
                jishu.add(array[i]);
            }
        }
        bianhuan(array,jishu,oushu);
    }
    private void bianhuan(int[] arr,Queue<Integer> i,Queue<Integer> j){
        int len1 = i.size();
        for (int i1= 0;i1<arr.length;i1++){
            if (i1<len1){
                arr[i1]=i.poll();
            }else {
                arr[i1]=j.poll();
            }
        }
    }

    public static void main(String[] args) {
        ReOrderArray14 reOrderArray14 = new ReOrderArray14();
        int[] arr = {1,2,3,4,5,6};
        reOrderArray14.reOrderArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
