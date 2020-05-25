package 剑指Offer;

import javax.naming.NameNotFoundException;
import java.util.Arrays;

/**
 * @ClassName: StructureTreeqz06
 * @Description:由前序和中序遍历重建二叉树
 * @Author: lhp
 * @Date: 2020/3/9 23:34
 * @Version: V1.0
 **/
public class StructureTreeqz06 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        //递归分支节点
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                index = i;
                break;
            }
        }
        node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));
        node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index + 1, in.length));
        return node;
    }
}
