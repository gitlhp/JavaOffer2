package 数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: IntersectionTwoArraysII_350
 * @Description:两个数组的交集
 * @Author: lhp
 * @Date: 2020/2/28 13:40
 * @Version: V1.0
 **/
public class IntersectionTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        IntersectionTwoArraysII_350 lhp = new IntersectionTwoArraysII_350();
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        int[] c = lhp.intersect(a,b);
        for (int i : c) {
            System.out.println(i);
        }
    }
}
