package 二叉树.遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: BinaryTreePreorderTraversal_144
 * @Description：二叉树的前序遍历
 * @Author: lhp
 * @Date: 2020/2/22 13:19
 * @Version: V1.0
 **/
public class BinaryTreePreorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root != null) {
            s.push(root);
        }
        while (!s.isEmpty()) {
            TreeNode p = s.pop();
            list.add(p.val);
            if (p.right != null) {
                s.push(p.right);
            }
            if (p.left != null) {
                s.push(p.left);
            }

        }
        return list;
    }
}
