package 数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TwoSum_1
 * @Description：两数之和
 * @Author: lhp
 * @Date: 2020/2/28 20:32
 * @Version: V1.0
 **/
public class TwoSum_1 {
    //暴力穷举法
    public int[] twoSum1(int[] nums, int target) {
        int index[] = new int[2];//??????
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                } else {
                    continue;
                }
            }
        }
        return index;
    }

    //0（n）
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0, len = nums.length; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        for (int i = 0,len  =nums.length; i < len; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
