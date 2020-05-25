package 剑指Offer;

/**
 * @ClassName: MaxSubArray31
 * @Description
 * @Author: lhp
 * @Date: 2020/3/11 23:10
 * @Version: V1.0
 **/
public class MaxSubArray31 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
//        int sum = 0;
//        int result = nums[0];
//        for (int num : nums) {
//            sum = sum > 0 ? sum + num : num;
//            result = Math.max(sum, result);
//        }
//        return result;
        int sum = 0;
        int result = nums[0];
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            result = Math.max(sum,result);
        }
        return result;
    }
}
