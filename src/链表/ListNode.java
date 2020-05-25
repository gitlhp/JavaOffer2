package 链表;

/**
 * @ClassName: ListNode
 * @Description
 * @Author: lhp
 * @Date: 2020/2/15 21:54
 * @Version: V1.0
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode node(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode node = head;
        for (int i = 1; i < arr.length; i++) {
            head.next = new ListNode(arr[i]);
            head = head.next;
        }
        return node;
    }
    public static ListNode end(ListNode head){
        while (head.next!=null){
            head = head.next;
        }
        return head;
    }
}
