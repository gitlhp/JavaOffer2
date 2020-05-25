package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: DistributeCandies_575
 * @Description：分糖果 简单
 * @Author: lhp
 * @Date: 2020/2/27 15:51
 * @Version: V1.0
 **/
public class DistributeCandies_575 {
    /**
     * 情况：1.种类都不同，N/2
     * 2.去重后为偶数！=N，reture set.size
     * 3.去重后为奇数 return candies.length / 2
     *
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);//去重
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
