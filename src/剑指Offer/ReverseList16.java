package 剑指Offer;

/**
 * @ClassName: ReverseList16
 * @Description:反转链表
 * @Author: lhp
 * @Date: 2020/3/10 15:51
 * @Version: V1.0
 **/
public class ReverseList16 {
    //原地旋转
    public ListNode ReverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode pre=null;
        ListNode root=head;
        ListNode node;
        while (head!=null){
            //记录当前节点的下一个节点
            node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }
}
