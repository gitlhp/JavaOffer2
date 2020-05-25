package 剑指Offer;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

/**
 * @ClassName: VerifySquenceOfBST24
 * @Description:二叉搜索树的后序遍历
 * @Author: lhp
 * @Date: 2020/3/11 22:38
 * @Version: V1.0
 **/
public class VerifySquenceOfBST24 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        int rstart = 0;
        int rootIndex = sequence.length - 1;
        //通过左右根大小判断 寻找左右界限
        for (int i = 0; i < rootIndex; i++) {
            if (sequence[i] < sequence[rootIndex]) {
                rstart++;
            }
        }
        //只有右子树
        if (rstart == 0) {
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, rootIndex));
            return true;
        }
        for (int i = rstart; i < rootIndex; i++) {
            if (sequence[i] <= sequence[rootIndex]) {
                return false;
            }
        }
        VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, rstart));
        VerifySquenceOfBST(Arrays.copyOfRange(sequence, rstart, rootIndex));
        return true;

    }
}
