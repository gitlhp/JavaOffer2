package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: lc1
 * @Description:两数之和-hashmap
 * @Author: lhp
 * @Date: 2020/3/21 20:52
 * @Version: V1.0
 **/
public class lc1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
