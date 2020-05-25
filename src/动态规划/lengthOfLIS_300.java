package 动态规划;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;

/**
 * @ClassName: lengthOfLIS_300
 * @Description:最长上升子序列
 * @Author: lhp
 * @Date: 2020/3/27 14:43
 * @Version: V1.0
 **/
public class lengthOfLIS_300 {
    public int lengthOfLIS(int[] nums) {
       int n =nums.length;
       int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res=0; ;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
