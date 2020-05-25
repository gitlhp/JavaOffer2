package 链表.合并;

import 链表.ListNode;

import java.util.TreeMap;

/**
 * @ClassName: MergeTwoLists_21
 * @Description:合并两个链表
 * @Author: lhp
 * @Date: 2020/2/20 17:23
 * @Version: V1.0
 **/
public class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeTwoLists_21 mergeTwoLists_21 = new MergeTwoLists_21();
        int[] arr = {1, 2, 4};
        int[] arr1 = {1, 3, 4};
        ListNode l1 = ListNode.node(arr);
        ListNode l2 = ListNode.node(arr1);
        ListNode node = mergeTwoLists_21.mergeTwoLists(l1, l2);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
