package 剑指Offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName: Stack21
 * @Description:包含Min函数的栈
 * @Author: lhp
 * @Date: 2020/3/10 23:44
 * @Version: V1.0
 **/
public class Stack21 {
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        //栈顶
        stack.pop();
    }

    public int top() {
        //不删除栈顶
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        int tmp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }
}
