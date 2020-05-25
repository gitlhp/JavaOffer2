package 链表.删除;

import 链表.ListNode;

/**
 * @ClassName: DeleteNodeInLinkedList_237
 * @Description：删除指定节点
 * @Author: lhp
 * @Date: 2020/2/15 21:47
 * @Version: V1.0
 **/
public class DeleteNodeInLinkedList_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
