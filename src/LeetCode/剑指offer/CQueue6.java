package LeetCode.剑指offer;

import java.util.Stack;

/**
 * @ClassName: CQueue6
 * @Description：用两个栈实现队列
 * @Author: lhp
 * @Date: 2020/4/15 15:53
 * @Version: V1.0
 **/
public class CQueue6 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue6() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        //只负责进入
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        //也许不走循环
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        return -1;
    }
}
