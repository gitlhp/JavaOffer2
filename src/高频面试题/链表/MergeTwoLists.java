package 高频面试题.链表;

import 链表.ListNode;

/**
 * @ClassName: MergeTwoLists
 * @Description:合并两个有序的链表
 * @Author: lhp
 * @Date: 2020/5/3 19:55
 * @Version: V1.0
 **/
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1==null) {
            return node2;
        }
        if (node2==null) {
            return node1;
        }
        if (node1.val<node2.val){
            node1.next = mergeTwoLists(node1.next,node2);
            return node1;
        }else {
            node2.next = mergeTwoLists(node1,node2.next);
            return node2;
        }


    }
}
