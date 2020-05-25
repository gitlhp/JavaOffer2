package 高频面试题.链表;

import 链表.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: GetIntersectionNode
 * @Description:两个链表的第一个公共节点
 * @Author: lhp
 * @Date: 2020/5/3 20:22
 * @Version: V1.0
 **/
public class GetIntersectionNode {
    /**
     * 传统的hash表方法
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode getIntersectionNode1(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while (l1 != null) {
            set.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            if (set.contains(l2)) {
                return l2;
            }
            l2 = l2.next;
        }
        return null;
    }

    /**
     * 双指针
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode getIntersectionNode2(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != node2) {
            node1 = node1 == null ? l2 : node1.next;
            node2 = node2 == null ? l1 : node2.next;
        }
        return node1;
    }
}
