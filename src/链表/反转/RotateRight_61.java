package 链表.反转;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RotateRight_61
 * @Description：旋转链表
 * @Author: lhp
 * @Date: 2020/2/17 1:39
 * @Version: V1.0
 **/
public class RotateRight_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        ListNode node1 = head;
        //数组记录val
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[(i + k) % list.size()] = list.get(i);
        }
        int i = 0;
        while (node != null) {
            node.val = arr[i];
            node = node.next;
            i++;
        }
        return node1;
    }

    public static void main(String[] args) {

    }
}
