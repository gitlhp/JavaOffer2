package 剑指Offer;

/**
 * @ClassName: HasSubtree18
 * @Description:判断二叉树 A 中是否包含子树 B
 * @Author: lhp
 * @Date: 2020/3/10 17:03
 * @Version: V1.0
 **/
public class HasSubtree18 {
    public boolean hasSubTree(TreeNode source, TreeNode target) {
        if (target == null) {
            return true;
        }
        if (source == null) {
            return false;
        }
        if (doesTree1HaveTree2(source, target)) {
            return true;
        }
        return hasSubTree(source.left, target) || hasSubTree(source.right, target);
    }

    public static boolean doesTree1HaveTree2(TreeNode source, TreeNode target) {
        //递归出口 也是单次递归要做的事情
        if (source == null && target == null) {
            return true;
        }
        if (source == null || target == null) {
            return false;
        }
        if (source.val != target.val) {
            return false;
        }
        return doesTree1HaveTree2(source.left, target.left) && doesTree1HaveTree2(source.right, target.right);
    }
}
