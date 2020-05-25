//package 高频面试题.链表;
//
//import 链表.ListNode;
//
//import java.util.HashSet;
//
///**
// * @ClassName: HasCycle
// * @Description:判断链表是否有环
// * @Author: lhp
// * @Date: 2020/5/4 21:36
// * @Version: V1.0
// **/
//public class HasCycle {
//    public boolean hasCycle(ListNode node) {
//        HashSet<ListNode> set = new HashSet<>();
//        while (node != null) {
//            if (set.contains(node)) {
//                return true;
//            } else {
//                set.add(node);
//            }
//            node = node.next;
//        }
//        return false;
//    }
//
//    /**
//     * 快慢指针
//     * @param node
//     * @return
//     */
//    public boolean hasCycle(ListNode head) {
//        if (head!=null&&head.next!=null) {
//            ListNode quick = head;
//            ListNode slow = head;
//            while (true){
//                quick = quick.next;
//                if (quick==null){
//                    return false;
//                }
//                quick = quick.next;
////                if (quick)
//            }
//
//            return true;
//        }
//    }
//}
