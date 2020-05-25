package 动态规划;

/**
 * @ClassName: LongestPalindrome5
 * @Description:最长回文字符串
 * @Author: lhp
 * @Date: 2020/3/19 11:05
 * @Version: V1.0
 **/
public class LongestPalindrome5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String result = "";
        for (int i = n - 1; i >= 0; i--) {//babad
            for (int j = i; j < n; j++) {
                if (i==j) {//自身肯定回文
                    dp[i][j]=true;
                }else if (j==i+1){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }else {
                    dp[i][j]=dp[i+1][j-1];
                }

            }
        }
        return result;
    }
}
