package LeetCode.剑指offer;

/**
 * @ClassName: NumWays8
 * @Description:跳台阶初级
 * @Author: lhp
 * @Date: 2020/4/15 18:06
 * @Version: V1.0
 **/
public class NumWays8 {
    public int numWays(int n) {
        int[] dp = new int[n + 1];
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n > 1) {
            dp[0] = 1;
            dp[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
