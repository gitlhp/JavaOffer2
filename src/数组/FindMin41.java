package 数组;

import java.util.Set;

/**
 * @ClassName: FindMin41
 * @Description:给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * @Author: lhp
 * @Date: 2020/3/14 16:12
 * @Version: V1.0
 **/
public class FindMin41 {
    public int firstMissingPositive(int[] nums) {
        int res = 0;
        int n = nums.length - 1;
        int tmp = 0;

        while(res <= n){
            if(nums[res] == res + 1){
                res++;
            }else{
                tmp = nums[res];
                if(tmp > n + 1 || tmp < res + 1 || nums[tmp - 1] == tmp){
                    nums[res] = nums[n--];
                }else{
                    nums[res] = nums[tmp - 1];
                    nums[tmp - 1] = tmp;
                }
            }
        }
        return res + 1;
    }
}
