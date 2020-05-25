package 二叉树.遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: BinaryTreeInorderTraversal_94
 * @Description：二叉树的中序遍历
 * @Author: lhp
 * @Date: 2020/2/21 15:00
 * @Version: V1.0
 **/
public class BinaryTreeInorderTraversal_94 {
    //中序非递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while (!s.isEmpty() || p != null) {
            if (p != null) {
                s.push(p);
                p = p.left;
            } else {
                p = s.pop();
                list.add(p.val);
                //此时、将当前节点的右孩子作为当前节点
                p = p.right;
            }
        }
        return list;
    }
}
