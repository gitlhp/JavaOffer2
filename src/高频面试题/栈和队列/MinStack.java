package 高频面试题.栈和队列;

import java.util.Stack;

/**
 * @ClassName: MinStack
 * @Description:最小栈
 * @Author: lhp
 * @Date: 2020/5/5 15:48
 * @Version: V1.0
 **/
public class MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (val < min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        } else {
            stack.pop();
        }
    }

    public int getMin() {
        return min;
    }
}
