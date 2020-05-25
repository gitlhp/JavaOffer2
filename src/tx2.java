//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
//
//
//public class tx2 {
//    private static Stack<Integer> stack1 = new Stack<>();
//    private static Stack<Integer> stack2 = new Stack<>();
//
//    public static void add(int val) {
//        stack1.push(val);
//    }
//
//
//    public static void poll() {
//        if (!stack2.isEmpty()) {
//            stack2.pop();
//        }
//        while (!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        if (!stack2.isEmpty()) {
//            stack2.pop();
//        }
//    }
//
//    public static int peek() {
//        if (!stack2.isEmpty()) {
//            stack2.peek();
//        }
//        while (!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        if (!stack2.isEmpty()) {
//            stack2.peek();
//        }
//        return -1;
//    }
//
//
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            String str = in.next();
//            if (str.equals("poll")) {
//                Main.poll();
//            } else if (str.equals("peek")) {
//                int v = Main.peek();
//                list.add(v);
//            } else {
//                char[] chars = str.toCharArray();
//                char[] chars1 = new char[4];
//                int n1 = 0;
//                for (int k = 0; k < chars.length; k++) {
//                    if (chars[i] >= '0' && chars[i] <= '9') {
//                        System.out.println(chars[i]);
//                        chars1[n1] = chars[i];
//                        n1++;
//                    }
//                }
////                System.out.println(chars1[0]);
//                int x = Integer.valueOf(chars1.toString().trim());
////                Main.add(1);
//
//            }
//        }
//    }
//}
