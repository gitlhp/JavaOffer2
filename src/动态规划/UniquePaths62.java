package 动态规划;

/**
 * @ClassName: UniquePaths62
 * @Description:不同路径
 * @Author: lhp
 * @Date: 2020/4/9 15:31
 * @Version: V1.0
 **/
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        if (m <= 1 || n <= 1) {
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0){
                    dp[0][j]=1;
                } else if (j==0){
                    dp[i][0]=1;
                }else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
