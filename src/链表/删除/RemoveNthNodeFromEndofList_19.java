package 链表.删除;

import sun.plugin2.os.windows.FLASHWINFO;
import 链表.ListNode;

/**
 * @ClassName: RemoveNthNodeFromEndofList_19
 * @Description:删除链表的倒数第N个节点 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * * <p>
 * <p>
 * * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * @Author: lhp
 * @Date: 2020/2/17 0:10
 * @Version: V1.0
 * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗 :40.3 MB, 在所有 Java 提交中击败了5.03%的用户
 **/
public class RemoveNthNodeFromEndofList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        if (head.next == null && n == 1) {
            return null;
        }
        ListNode node = head;
        ListNode node1 = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        for (int i = 1; i < count - n; i++) {
            node = node.next;
        }
        if (count - n > 0) {//判断是否是删除第一个
            node.next = node.next.next;
        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
        return node1;
    }

    //一次遍历 双指针法
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode node = new ListNode(0);//考虑删除头结点的情况
        node.next = head;//保存头指针
        ListNode first = node;//先锋指针
        ListNode second = node;//后续指针
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return node.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndofList_19 removeNthNodeFromEndofList_19 = new RemoveNthNodeFromEndofList_19();
        //创建链表
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        head.next = head1;
//        head1.next = head2;
        head1.next = null;
        ListNode node = removeNthNodeFromEndofList_19.removeNthFromEnd1(head, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
