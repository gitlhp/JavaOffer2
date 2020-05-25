package 高频面试题.链表;

import 链表.ListNode;

/**
 * @ClassName: ReverseList
 * @Description:反转链表
 * @Author: lhp
 * @Date: 2020/5/3 17:03
 * @Version: V1.0
 **/
public class ReverseList {
    public static ListNode reverseList(ListNode node){
        ListNode pre = null;//前置指针
        ListNode curr = node;//当前指针
        ListNode next = null;//后续指针
        while (curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }
}
