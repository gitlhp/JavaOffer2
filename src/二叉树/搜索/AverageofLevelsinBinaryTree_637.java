package 二叉树.搜索;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: AverageofLevelsinBinaryTree_637
 * @Description
 * @Author: lhp
 * @Date: 2020/2/24 22:22
 * @Version: V1.0
 **/
public class AverageofLevelsinBinaryTree_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            double count = 0;
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                count+=node.val;
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                }
            }
            list.add(count/size);
        }
        return list;
    }
}
