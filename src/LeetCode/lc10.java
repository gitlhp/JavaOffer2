//package LeetCode;
//
//import java.util.concurrent.locks.ReentrantLock;
//
///**
// * @ClassName: lc10
// * @Description:正则表达式匹配-字符串，动态规划，
// * @Author: lhp
// * @Date: 2020/3/21 21:07
// * @Version: V1.0
// **/
//public class lc10 {
//    private static final ReentrantLock
//    public boolean isMatch(String s, String p) {
////dp[i][j]=true 表示s[0~(i-1)],p[0~(j-1)],匹配
//        boolean dp[][] = new boolean[s.length() + 1][p.length() + 1];
//        dp[0][0] = true;//初始值
//        //初始化
//        for (int i = 1; i < p.length() + 1; i++) {
//            if (p.charAt(i - 1) == '*') {
//                if (i > 1 && dp[0][i - 2]) {
//                    dp[0][i] = true;
//                }
//            }
//        }
//    }
//
//}
