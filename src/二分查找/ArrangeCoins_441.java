package 二分查找;

/**
 * @ClassName: ArrangeCoins_441
 * @Description:排列硬币
 * @Author: lhp
 * @Date: 2020/2/28 20:36
 * @Version: V1.0
 **/
public class ArrangeCoins_441 {
    //超时
    public int arrangeCoins(int n) {
        int k = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            k++;
            if (sum == n) {
                return k;
            }
            if (sum<n&&sum+i+1>n){
                return k;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        ArrangeCoins_441 arrangeCoins_441 = new ArrangeCoins_441();
        System.out.println(arrangeCoins_441.arrangeCoins(8));
    }
}
