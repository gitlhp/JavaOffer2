package 剑指Offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName: PrintList05
 * @Description:从尾到头打印链表
 * @Author: lhp
 * @Date: 2020/3/9 23:29
 * @Version: V1.0
 **/
public class PrintList05 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if (listNode==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode!=null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }
}
