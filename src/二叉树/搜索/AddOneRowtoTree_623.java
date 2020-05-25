package 二叉树.搜索;

import 二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: AddOneRowtoTree_623
 * @Description：在二叉树中增加一行
 * @Author: lhp
 * @Date: 2020/2/23 13:06
 * @Version: V1.0
 **/
public class AddOneRowtoTree_623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root==null) {
            return null;
        }
        if (d==1){
            //根据题意新建根节点
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            //检测d为0时直接返回就好
            if (--d==0) {
                return root;
            }
            int size =queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //循环减一，d为1时就是插入的位置
                if (d==1) {
                    TreeNode left = new TreeNode(v);
                    left.left = node.left;
                    node.left = left;
                    TreeNode right = new TreeNode(v);
                    right.right = node.right;
                    node.right = right;
                }else {
                    if (node.left!=null){
                        queue.offer(node.left)
;                    }
                    if (node.right!=null){
                        queue.offer(node.right);
                    }
                }
            }
        }
        return root;
    }
}
