package LeetCode.剑指offer;

/**
 * @ClassName: Fib7
 * @Description:斐波那契
 * @Author: lhp
 * @Date: 2020/4/15 17:56
 * @Version: V1.0
 **/
public class Fib7 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] res = new int[n+1];
        res[1]= 1;
        for (int i = 2; i <=n; i++) {
res[i] = (res[i-1]+res[i-2])%1000000007;
        }
        return res[n];
    }
}
