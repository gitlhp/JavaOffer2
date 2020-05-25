package 二叉树.搜索;

import 二叉树.TreeNode;

/**
 * @ClassName: SearchBST_700
 * @Description：二叉搜索树中的搜索
 * @Author: lhp
 * @Date: 2020/2/26 15:46
 * @Version: V1.0
 **/
public class SearchBST_700 {
    TreeNode node = null;

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            node = root;
            return node;
        }
        searchBST(root.left, val);
        searchBST(root.right, val);
        return node;
    }

    public TreeNode searchBST1(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = root.val > val ? root.left : root.right;
        }
        return root;
    }
}
