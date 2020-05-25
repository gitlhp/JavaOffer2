package 二叉树.性质;

import 二叉树.TreeNode;

/**
 * @ClassName: TrimBinarySearchTree_669
 * @Description:修剪二叉搜索树
 * @Author: lhp
 * @Date: 2020/2/24 16:31
 * @Version: V1.0
 **/
public class TrimBinarySearchTree_669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        //1.根节点小于L
        if (root.val<L){
            return trimBST(root.right,L,R);
        }else if (root.val>R){
            return trimBST(root.left,L,R);
        }else {
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
    }
}
