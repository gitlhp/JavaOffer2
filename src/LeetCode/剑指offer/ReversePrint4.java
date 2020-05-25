package LeetCode.剑指offer;

import java.util.Stack;

/**
 * @ClassName: ReversePrint4
 * @Description
 * @Author: lhp
 * @Date: 2020/4/15 11:13
 * @Version: V1.0
 **/
public class ReversePrint4 {
    public int[] reversePrint(ListNode head) {
        int n = 0, m = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
            n++;
        }
        int[] res = new int[n];
        while (!stack.isEmpty() && m >= 0) {
            res[m] = stack.pop();
            m++;
        }
        return res;
    }
}
