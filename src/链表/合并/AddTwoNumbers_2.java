package 链表.合并;

import 链表.ListNode;

/**
 * @ClassName: AddTwoNumbers_2
 * @Description：两数相加
 * @Author: lhp
 * @Date: 2020/2/20 14:00
 * @Version: V1.0
 **/
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        //创建哨兵
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (node1 != null || node2 != null) {
            sum = sum / 10;
            if (node1 != null) {
                sum += node1.val;
                node1 = node1.next;
            }
            if (node2 != null) {
                sum += node2.val;
                node2 = node2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
            System.out.println(d.val);
        }
        if (sum/10==1){
            d.next = new ListNode(1);
            System.out.println(1);
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers_2 addTwoNumbers_2 = new AddTwoNumbers_2();
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);
        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(8);
        addTwoNumbers_2.addTwoNumbers(n1,n2);

    }
}
