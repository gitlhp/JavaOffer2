package 链表.反转;

import 链表.ListNode;

/**
 * @ClassName: SwapNodesinPairs_24
 * @Description:两两交换链表中的节点
 * @Author: lhp
 * @Date: 2020/2/17 2:07
 * @Version: V1.0
 **/
public class SwapNodesinPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
}
