package 动态规划;

/**
 * @ClassName: MaxSubArray53
 * @Description：53. 最大子序和
 * @Author: lhp
 * @Date: 2020/4/9 14:11
 * @Version: V1.0
 **/
public class MaxSubArray53 {
    public int maxSubArray(int[] nums) {
        if (nums==null||nums.length==0) {
            return 0;
        }else if (nums.length==1){
            return nums[0];
        }else {
            int res = Integer.MIN_VALUE;
            int last = 0;
            for (int i = 0; i < nums.length; i++) {
                int now = Math.max(last,0)+nums[i];
                res  = Math.max(res,now);
                last = now;
            }
            return res;
        }
    }
}
