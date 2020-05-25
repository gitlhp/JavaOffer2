package 剑指Offer;

/**
 * @ClassName: FibonacciN09_1
 * @Description:输出斐波那契数列的第 n 项
 * @Author: lhp
 * @Date: 2020/3/10 0:30
 * @Version: V1.0
 **/
public class FibonacciN09_1 {
    public long fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
