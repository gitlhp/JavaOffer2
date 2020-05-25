package 动态规划;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: MinimumTotal120
 * @Description:120. 三角形最小路径和
 * @Author: lhp
 * @Date: 2020/4/9 14:48
 * @Version: V1.0
 **/
public class MinimumTotal120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null) {
            return 0;
        }
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);//设置初始值
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int temp = triangle.get(i).get(j);
                if (j==0) {
                    dp[i][j] = temp+dp[i-1][j];
                }else if (j==triangle.get(i).size()-1){
                    dp[i][j] = temp+dp[i-1][j-1];//最右边的只能加上上一行的左上
                }else {
                    dp[i][j]=temp+Math.min(dp[i-1][j-1],dp[i-1][j]);
                }
            }
        }
        Arrays.sort(dp[m-1]);
        return dp[m-1][0];
    }
}
