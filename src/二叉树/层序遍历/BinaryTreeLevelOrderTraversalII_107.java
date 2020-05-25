package 二叉树.层序遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: BinaryTreeLevelOrderTraversalII_107
 * @Description：二叉树的层次遍历
 * @Author: lhp
 * @Date: 2020/2/23 13:08
 * @Version: V1.0
 **/
public class BinaryTreeLevelOrderTraversalII_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> lists =new ArrayList<>();
       Queue<TreeNode> queue = new LinkedList<>();
       if (root==null){
           return lists;
       }
       queue.offer(root);
       while (!queue.isEmpty()){
           List<Integer> list = new ArrayList<>();
           //控制好size是关键
           int size = queue.size();
           for (int i = 0; i < size; i++) {
               TreeNode node = queue.poll();
               list.add(node.val);
               //只加入队列但是循环不读取
               if (node.left!=null){
                   queue.offer(node.left);
               }
               if (node.right!=null) {
                   queue.offer(node.right);
               }
           }
           //头插法 保证倒序
           lists.add(0,list);
       }
       return lists;
    }
}
