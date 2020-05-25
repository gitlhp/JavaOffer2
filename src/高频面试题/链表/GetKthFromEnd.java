package 高频面试题.链表;

import 链表.ListNode;

import java.util.Stack;

/**
 * @ClassName: GetKthFromEnd
 * @Description:链表中的倒数第K个数
 * @Author: lhp
 * @Date: 2020/5/3 16:12
 * @Version: V1.0
 **/
public class GetKthFromEnd {
    /**
     * 栈
     *
     * @param node
     * @return
     */
    public static ListNode getKthFromEnd(ListNode node, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode listNode = new ListNode(0);
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        for (int i = 0; i < k; i++) {
            listNode = stack.pop();
        }
        return listNode;
    }

    /**
     * 双指针
     * @param node
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd1(ListNode node, int k) {
        ListNode pnode = node;//先
        ListNode knode = node;//后
        int n = 0;
        while (pnode != null) {
            if (n >= k) {
                knode = knode.next;
            }
            pnode = pnode.next;
            n++;
        }
        return knode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
//        while (node!=null){
//            System.out.println(node.val);
//            node = node.next;
//        }
        ListNode node1 = GetKthFromEnd.getKthFromEnd1(node,2);
        System.out.println(node1==null?"sss":node1.val);


    }
}
