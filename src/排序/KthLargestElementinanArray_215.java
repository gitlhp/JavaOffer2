package 排序;

/**
 * @ClassName: KthLargestElementinanArray_215
 * @Description：数组中的第K大的元素
 * @Author: lhp
 * @Date: 2020/2/27 15:29
 * @Version: V1.0
 **/
public class KthLargestElementinanArray_215 {
    /**
     * 1.从大到小排序
     * 2.取出第K个最大的元素
     */
    public static int findKthLargest(int[] nums, int k) {
//冒泡排序
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = 0; j <nums.length-i-1 ; j++) {
                if (nums[j+1]>nums[j]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }
}
