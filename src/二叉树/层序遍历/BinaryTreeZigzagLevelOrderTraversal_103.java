package 二叉树.层序遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: BinaryTreeZigzagLevelOrderTraversal_103
 * @Description:二叉树的锯齿形层次遍历
 * @Author: lhp
 * @Date: 2020/2/23 21:39
 * @Version: V1.0
 **/
public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        queue.offer(root);
        int n = 1;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (n % 2 == 0) {
                lists.add(reverse(list));
            } else {
                lists.add(list);
            }
            n++;
        }
        return lists;
    }

    private List<Integer> reverse(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        return list1;
    }
    /**

     * 思路：记录行数，当奇数，从左到右添加到level，当偶数反之

     */

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        //记录行数，当奇数，从左到右添加到level，否则反之
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //记录每行
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (depth % 2 == 1) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val);
                }
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            res.add(level);
            depth++;
        }
        return res;
    }
}
