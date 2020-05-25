package 二叉树.构造;

import 二叉树.TreeNode;

/**
 * @ClassName: ConvertSortedArrayBinarySearchTree_108
 * @Description:把一个有序数组转换成一颗二分查找树
 * @Author: lhp
 * @Date: 2020/2/24 11:29
 * @Version: V1.0
 **/
public class ConvertSortedArrayBinarySearchTree_108 {

    /**
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
     * 思路：树的遍历+二分查找
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        //递归出口条件
        if (l > r) {
            return null;
        }
        //单次操作要做什么事 确定并创建每一次的节点
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        //递归
        root.left = helper(nums, l, m - 1);
        root.right = helper(nums, m + 1, r);
        //要返回什么
        return root;
    }

    //实现二分查找
    private static int binarySearch(int[] arr, int a) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            //找到中间位置
            mid = (low + high) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (a > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;//没有找到
    }

    //求二叉树的深度
    public int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        return Math.max(left, right) + 1;
    }
}
