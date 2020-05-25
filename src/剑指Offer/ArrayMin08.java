package 剑指Offer;

/**
 * @ClassName: ArrayMin08
 * @Description:旋转数组的最小数字
 * @Author: lhp
 * @Date: 2020/3/10 0:13
 * @Version: V1.0
 **/
public class ArrayMin08 {
    //寻找最左下标
    public static int minInReversingList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
