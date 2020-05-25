package 链表.合并;

import 链表.ListNode;

/**
 * @ClassName: GetIntersectionNode_160
 * @Description;找出两个链表的交点
 * @Author: lhp
 * @Date: 2020/2/20 15:10
 * @Version: V1.0
 **/
public class GetIntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
//        while (l1 != l2) {
//            l1 = (l1 == null) ? headB : l1.next;
//            l2 = (l2 == null) ? headA : l2.next;
//        }
        while (l1!=l2){
            l1 = (l1==null)?headB:l1.next;
            l2 = (l2 == null)?headA:l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        GetIntersectionNode_160 h = new GetIntersectionNode_160();
        int[] arr={1,2,3};
        int[] arr1={4,5};
        int[] arr2={6,7,8};
        ListNode l1 = ListNode.node(arr);
        ListNode l2 = ListNode.node(arr1);
        ListNode l11 = ListNode.end(l1);
        ListNode l22 = ListNode.end(l2);
        ListNode l3 = ListNode.node(arr2);
        l11.next = l3;
        l22.next = l3;
        ListNode node = h.getIntersectionNode(l1,l2);
        System.out.println(node.val);
    }
}
