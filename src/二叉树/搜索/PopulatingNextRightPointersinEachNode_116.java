package 二叉树.搜索;

/**
 * @ClassName: PopulatingNextRightPointersinEachNode_116
 * @Description:填充每个节点的下一个右侧节点指针
 * @Author: lhp
 * @Date: 2020/2/26 15:23
 * @Version: V1.0
 **/
public class PopulatingNextRightPointersinEachNode_116 {
    /**
     * 左孩子指向右孩子，右孩子指向next不为null的兄弟的左孩子
     * 初始状态下，所有 next 指针都被设置为 NULL
     * 前提：完全二叉树
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root==null) {
            return null;
        }
        if (root.left!=null) {
            root.left.next = root.right;
        }
        if (root.next!=null&&root.right!=null){
            root.right.next=root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;

    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
