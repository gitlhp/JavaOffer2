//package 剑指Offer;
//
///**
// * @ClassName: DelNode13
// * @Description:O(1)时间删除链表节点
// * @Author: lhp
// * @Date: 2020/3/10 15:06
// * @Version: V1.0
// **/
//public class DelNode13 {
//    public void deleteNode(ListNode head, ListNode deListNode) {
//        if (deListNode == null || head == null) return;
//        if (head == deListNode) {
//            head = null;
//        } else { // 若删除节点是末尾节点，往后移一个
//            if (deListNode.nextNode == null) {
//                ListNode pointListNode = head;
//                while (pointListNode.nextNode.nextNode != null) {
//                    pointListNode = pointListNode.nextNode;
//                }
//                pointListNode.nextNode = null;
//            } else {
//                deListNode.data = deListNode.nextNode.data;
//                deListNode.nextNode = deListNode.nextNode.nextNode;
//            }
//        }
//
//    }
//}
