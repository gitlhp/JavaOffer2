package 剑指Offer;

/**
 * @ClassName: Binary10
 * @Description:二进制中1的个数
 * @Author: lhp
 * @Date: 2020/3/10 1:34
 * @Version: V1.0
 **/
public class Binary10 {
    public int NumberOf1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
