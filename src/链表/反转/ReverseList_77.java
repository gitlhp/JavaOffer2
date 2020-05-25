package 链表.反转;

import 链表.ListNode;

/**
 * @ClassName: ReverseList_77
 * @Description
 * @Author: lhp
 * @Date: 2020/2/17 0:56
 * @Version: V1.0
 **/
public class ReverseList_77 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;//保存前一个元素
        ListNode cuur = head;//保存当前元素
        while (cuur!=null){
            ListNode next = cuur.next;//记录下一个节点
            cuur.next=prev;
            prev=cuur;
            cuur=next;
        }
        return prev;
    }
}
