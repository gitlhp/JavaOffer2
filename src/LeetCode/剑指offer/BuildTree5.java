package LeetCode.剑指offer;

import java.util.Arrays;

/**
 * @ClassName: BuildTree5
 * @Description:重建二叉树
 * @Author: lhp
 * @Date: 2020/4/15 11:26
 * @Version: V1.0
 **/
public class BuildTree5 {
    //递归传入数组的拷贝
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        //每次递归根节点
        TreeNode node = new TreeNode(preorder[0]);
        int m = 0;
        //循环找分界
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                m = i;
                break;
            }
        }
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, m + 1), Arrays.copyOfRange(inorder, 0, m));
        node.right = buildTree(Arrays.copyOfRange(preorder, m + 1, preorder.length), Arrays.copyOfRange(inorder, m + 1, inorder.length));
        return node;
    }

    //递归出入子数组的边界索引
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }

    private TreeNode helper(int[] pre, int preL, int preR, int[] inorder, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }
        int rootVal = pre[preL];
        int index = 0;
        while (index <= inR && inorder[index] != rootVal) {
            index++;
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(pre,preL+1,preL-inL+index,inorder,index+1,inR);
        root.right = helper(pre,preL-inL+index+1,preR,inorder,index+1,inR);
        return root;
    }

}
