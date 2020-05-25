package 剑指Offer;

import java.util.Stack;

/**
 * @ClassName: StacksImplQueues07
 * @Description:两个栈实现队列
 * @Author: lhp
 * @Date: 2020/3/9 23:51
 * @Version: V1.0
 **/
public class StacksImplQueues07 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("栈为空！");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }
}
