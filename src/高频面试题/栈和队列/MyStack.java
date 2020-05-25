package 高频面试题.栈和队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: MyStack
 * @Description:用队列实现栈
 * @Author: lhp
 * @Date: 2020/5/5 16:32
 * @Version: V1.0
 **/
public class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
    queue = new LinkedList<>();
    }
    public void push(int x){
        queue.add(x);
        int size =queue.size();
        while (size-->1){
            queue.add(queue.poll());
        }
    }

    public int pop(){
        return queue.remove();
    }
}
