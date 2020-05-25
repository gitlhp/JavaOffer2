package 链表.删除;

import 链表.ListNode;

import java.util.*;

/**
 * @ClassName: RemoveDuplicatesfromSortedList_83
 * @Description:删除链表中的重复元素
 * @Author: lhp
 * @Date: 2020/2/15 22:10
 * @Version: V1.0
 **/
public class RemoveDuplicatesfromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> list = new LinkedHashSet<>();
        ListNode node = head;
        ListNode node1 = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Iterator<Integer> integerIterator = list.iterator();
        int n = 0;
        while (integerIterator.hasNext()) {
            n++;
            node.val = integerIterator.next();
            if (n < list.size()) {
                node = node.next;
            }
        }
        node.next = null;
        return node1;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates1(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList_83 removeDuplicatesfromSortedList_83 = new RemoveDuplicatesfromSortedList_83();
//        int[] arr = {1,1,2};
//        Set<Integer> arr1 = new LinkedHashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            arr1.add(arr[i]);
//        }
//        Iterator<Integer> jj = arr1.iterator();
//        while (jj.hasNext()){
//            System.out.println(jj.next());
//        }
        //创建链表
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head.next = head1;
        head1.next = head2;
        head2.next = null;
//        while (head!=null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        ListNode listNode = removeDuplicatesfromSortedList_83.deleteDuplicates1(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
