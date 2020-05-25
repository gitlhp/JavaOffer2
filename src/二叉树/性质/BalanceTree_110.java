package 二叉树.性质;

import 二叉树.TreeNode;

/**
 * @ClassName: BalanceTree_110
 * @Description：给定一个二叉树，判断它是否是高度平衡的二叉树。
 * @Author: lhp
 * @Date: 2020/2/24 15:54
 * @Version: V1.0
 **/
public class BalanceTree_110 {
    public boolean isBalanced(TreeNode root) {
//判断左右子树的高度差
       return height(root)!=-1;
    }
    private int height(TreeNode root){
        if (root==null) {
            return 0;
        }
        int left = height(root.left);
        //避免多余运算
        if (left==-1) {
            return -1;
        }
        int right = height(root.right);
        if (right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced1(TreeNode root) {
//判断左右子树的高度差
        return height(root)!=-1;
    }
}
