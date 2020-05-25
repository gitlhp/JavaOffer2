package 二叉树.搜索;

import 二叉树.TreeNode;

/**
 * @ClassName: MinimumAbsoluteDifferenceinBST_530
 * @Description:二叉搜索树的最小绝对差
 * @Author: lhp
 * @Date: 2020/2/26 11:08
 * @Version: V1.0
 **/
public class MinimumAbsoluteDifferenceinBST_530 {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    //中序遍历
    public int getMinimumDifference(TreeNode root) {
        if (root==null) {
            return min;
        }
        getMinimumDifference(root.left);
        if (prev!=null) {
            min = Math.min(min,root.val-prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return min;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceinBST_530 minimumAbsoluteDifferenceinBST_530 = new MinimumAbsoluteDifferenceinBST_530();
        TreeNode root  =new TreeNode(1);
        TreeNode node  =new TreeNode(3);
        TreeNode node1  =new TreeNode(2);
        TreeNode node2 = null;
        root.left = node2;
        root.right = node;
        node.left = node1;
        node.right = node2;
        node1.left=node2;
        node1.right = node2;

        System.out.println(minimumAbsoluteDifferenceinBST_530.getMinimumDifference(root));
    }
}
