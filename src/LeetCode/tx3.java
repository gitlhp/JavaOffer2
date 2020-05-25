package LeetCode;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: tx3
 * @Description
 * @Author: lhp
 * @Date: 2020/4/26 21:35
 * @Version: V1.0
 **/
public class tx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            if (k > x) {
                return;
            } else {
                list.add(aa(x, k));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static int aa(int a, int k) {
        int m = 0;
        if (a % 2 == 0) {
            m = a / 2;
        } else {
            m = (a - 1) / 2;
        }
        if (m < Math.pow(2, k) && m > Math.pow(2, k - 1)) {
            return m;
        } else {
            aa(m, k);
        }
        return -1;
    }

//

}
