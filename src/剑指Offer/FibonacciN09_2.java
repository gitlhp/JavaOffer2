package 剑指Offer;

/**
 * @ClassName: FibonacciN09_2
 * @Description:青蛙跳台阶
 * @Author: lhp
 * @Date: 2020/3/10 1:14
 * @Version: V1.0
 **/
public class FibonacciN09_2 {
    //result[n] = result[n-1]+result[n-2];
    public int JumpFloor(int n) {
        if (n <= 2) {
            return n;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        FibonacciN09_2 fibonacciN09_2 = new FibonacciN09_2();
        System.out.println(fibonacciN09_2.JumpFloor(3));
    }
}
