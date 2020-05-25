package 二叉树.层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: NaryTreeLevelOrderTraversal_429
 * @Description：N叉树的层次遍历
 * @Author: lhp
 * @Date: 2020/2/24 11:03
 * @Version: V1.0
 **/

public class NaryTreeLevelOrderTraversal_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root==null){
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node  node = queue.poll();
                list.add(node.val);
                for (Node node1 : node.children){
                    queue.offer(node1);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
