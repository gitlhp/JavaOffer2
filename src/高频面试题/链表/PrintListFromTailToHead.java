package 高频面试题.链表;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: PrintListFromTailToHead
 * @Description
 * @Author: lhp
 * @Date: 2020/5/3 14:29
 * @Version: V1.0
 **/
public class PrintListFromTailToHead{
    public static List<Integer> printListFromTailToHead(ListNode node) {
        List<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        while (node!=null){
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
