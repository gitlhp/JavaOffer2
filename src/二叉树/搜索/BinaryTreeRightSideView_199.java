package 二叉树.搜索;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: BinaryTreeRightSideView_199
 * @Description:二叉树的右视图
 * @Author: lhp
 * @Date: 2020/2/24 22:47
 * @Version: V1.0
 **/
public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i==size-1){
                    list.add(node.val);
                }
                if (root.left!=null) {
                    queue.add(node.left);
                }
                if (root.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
}
