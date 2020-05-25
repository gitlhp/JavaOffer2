package 高频面试题.栈和队列;

import java.util.Stack;

/**
 * @ClassName: IsValid
 * @Description：有效的括号
 * @Author: lhp
 * @Date: 2020/5/5 15:18
 * @Version: V1.0
 **/
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (isSym(c, stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    private boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
