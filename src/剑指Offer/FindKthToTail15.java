package 剑指Offer;

/**
 * @ClassName: FindKthToTail15
 * @Description:输入一个链表，输出该链表中倒数第k个结点。
 * @Author: lhp
 * @Date: 2020/3/10 15:33
 * @Version: V1.0
 **/
public class FindKthToTail15 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        //先行军
        ListNode node1 = head;
        ListNode node2 = head;
        while (node1 != null && k > 0) {
            node1 = node1.next;
            k--;
            if (node1 == null && k > 0) {
                return null;
            }

        }
        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }
}
