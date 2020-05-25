package 二叉树.遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: BinaryTreePostorderTraversal_145
 * @Description:二叉树的后序遍历
 * @Author: lhp
 * @Date: 2020/2/21 15:47
 * @Version: V1.0
 **/
public class BinaryTreePostorderTraversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode p = root, r = null;//p记录当前节点，r记录上一次访问节点
        Stack<TreeNode> s = new Stack<>();
        while (p != null || !s.isEmpty()) {
            //左孩子一直入栈
            if (p != null) {
                s.push(p);
                p = p.left;
            } else {
                p = s.peek();
                p = p.right;
                if (p != null && p != r) {//r是为了避免重复访问
                    s.push(p);
                    p = p.left;
                } else {
                    p = s.pop();
                    list.add(p.val);
                    r = p;
                    p = null;
                }
            }
        }
        return list;
    }
}
