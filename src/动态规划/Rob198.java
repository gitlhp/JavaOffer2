package 动态规划;

/**
 * @ClassName: Rob198
 * @Description：打家劫舍
 * @Author: lhp
 * @Date: 2020/4/10 11:26
 * @Version: V1.0
 **/
public class Rob198 {
    /**
     * 解题思路：1.发f[i]表示前i个数中选择，所以
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dpf = new int[n+1];//dpf[i]表示当前值不选
        int[] dpg = new int[n+1];//dpg[i]表示当前值选择 n+1避免数组越界
        for (int i = 1; i <=n ; i++) {
            dpf[i] = Math.max(dpf[i-1],dpg[i-1]);
            dpg[i] = dpf[i-1]+nums[i-1];
        }
        return Math.max(dpf[n],dpg[n]);
    }
}
