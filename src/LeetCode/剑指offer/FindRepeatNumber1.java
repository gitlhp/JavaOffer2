package LeetCode.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FindRepeatNumber1
 * @Description:数组中的重复数字
 * @Author: lhp
 * @Date: 2020/4/15 10:23
 * @Version: V1.0
 **/
public class FindRepeatNumber1 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i)!=1){
                return i;
            }
        }
        return -1;
    }

    /**
     * 原地置换算法
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }

}
