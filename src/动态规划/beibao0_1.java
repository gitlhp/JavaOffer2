package 动态规划;

import java.util.Scanner;

/**
 * @ClassName: beibao0_1
 * @Description:0-1背包问题
 * @Author: lhp
 * @Date: 2020/4/12 11:18
 * @Version: V1.0
 **/
public class beibao0_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//物品数量
        int m = scanner.nextInt();//背包总体积
        int[] v = new int[n+1];
        int[] w = new int[m+1];
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                dp[i][j] = dp[i-1][j];//前i个物品中选择，满足j体积下的最大价值，并且不选择第i个元素
                if (j>=v[i]) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v[i]]+w[i]);
                }
            }
        }
        System.out.println(dp[n][m]);
        return;

    }
}
