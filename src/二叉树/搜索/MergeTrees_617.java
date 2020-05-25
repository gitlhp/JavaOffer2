package 二叉树.搜索;

import 二叉树.TreeNode;

/**
 * @ClassName: MergeTrees_617
 * @Description:合并二叉树
 * @Author: lhp
 * @Date: 2020/2/26 10:25
 * @Version: V1.0
 **/
public class MergeTrees_617 {
    /**
     * 每次构建一个完整的节点 包括节点的值 以及左右孩子引用
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //递归出口
        if (t1==null&&t2==null) {
            return null;
        }
        //单次递归要干什么事：创建一个节点并构建其左右孩子节点
        int val = (t1==null?0:t1.val)+(t2==null?0:t2.val);
        TreeNode node = new TreeNode(val);
        node.left = mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        node.right = mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        //递归返回值
        return node;
    }
}
