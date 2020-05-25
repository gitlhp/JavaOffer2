package 剑指Offer;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @ClassName: MergeList17
 * @Description:合并两个有序链表
 * @Author: lhp
 * @Date: 2020/3/10 16:04
 * @Version: V1.0
 **/
public class MergeList17 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
