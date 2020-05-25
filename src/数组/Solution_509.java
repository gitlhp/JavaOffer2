package 数组;

/**
 * @ClassName: Solution_509
 * @Description:斐波那契
 * @Author: lhp
 * @Date: 2020/2/28 13:33
 * @Version: V1.0
 **/
public class Solution_509 {
    public int fib(int N) {

        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return 2;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
