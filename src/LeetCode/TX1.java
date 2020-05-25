package LeetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class TX1 {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void Push(int val) {
        stack1.push(val);
    }

    public static int Top() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;

    }

    public static int Pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;

    }

    public static int Size() {
        int a = stack1.size();
        int b = stack2.size();
        return a + b;
    }

    public static void Clear() {
        stack1.clear();
        stack2.clear();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            for (int j = 0; j < m; j++) {
                String str = in.next();
                if (str.equals("TOP")) {
                    int v = TX1.Top();
                    list.add(v);
                } else if (str.equals("POP")) {
                    int v = TX1.Pop();
                    if (v == -1) {
                        list.add(v);
                    }
                } else if (str.equals("SIZE")) {
                    int v = TX1.Size();
                    list.add(v);
                } else if (str.equals("CLEAR")) {
                    TX1.Clear();
                } else {
                    char[] chars = str.toCharArray();
                    char[] chars1 = new char[4];
                    int n1 = 0;
                    for (int k = 0; k < chars.length; k++) {
                        if (chars[i] >= '0' && chars[i] <= '9') {
                            System.out.println(chars[i]);
                            chars1[n1] = chars[i];
                            n1++;
                        }
                    }
                    System.out.println(chars1[0]);
//                    int x = Integer.valueOf(chars1.toString().trim());
                    TX1.Push(1);
                }
            }
        }
    }
}
