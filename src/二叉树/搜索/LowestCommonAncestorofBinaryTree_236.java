package 二叉树.搜索;

import 二叉树.TreeNode;

/**
 * @ClassName: LowestCommonAncestorofBinaryTree_236
 * @Description:二叉树的最小公共祖先
 * @Author: lhp
 * @Date: 2020/2/25 23:46
 * @Version: V1.0
 **/
public class LowestCommonAncestorofBinaryTree_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) {
            return root;
        }
        //判断是否存在该值在左子树或者右子树
        if (p==root||q==root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left!=null&&right!=null){
            return root;
        }
        return left==null?right:left;



    }
}
