package 二叉树.路径;

import 二叉树.TreeNode;

/**
 * @ClassName: BinaryTreeMaximumPathSum_124
 * @Description:求最大路径和
 * @Author: lhp
 * @Date: 2020/2/22 13:34
 * @Version: V1.0
 **/
public class BinaryTreeMaximumPathSum_124 {
    int ans;


    public int maxPathSum(TreeNode root) {

        ans = Integer.MIN_VALUE;

        maxDeep(root);

        return ans;

    }


    /**
     * 1、前序遍历
     * <p>
     * 2、求根结点到所有叶子结点的pathsum，遍历整颗树
     * <p>
     * 3、求根结点到叶子结点的最大深度
     */

    public int maxDeep(TreeNode root) {

        if (root == null) return 0;

        //叶子结点

        if (root.left == null && root.right == null) {

            ans = Math.max(ans, root.val);

            return root.val;

        } else {

            int left = maxDeep(root.left);

            int right = maxDeep(root.right);

            int tmp = Math.max(left, right) + root.val;

            tmp = Math.max(tmp, root.val);


            ans = Math.max(ans, tmp);

            ans = Math.max(ans, left + right + root.val);

            return tmp;

        }

    }
}
