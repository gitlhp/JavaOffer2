package 数组;

/**
 * @ClassName: BitAnd2bitCharacters_717
 * @Description：1比特与2比特字符
 * @Author: lhp
 * @Date: 2020/2/27 21:10
 * @Version: V1.0
 **/
public class BitAnd2bitCharacters_717 {
    public boolean isOneBitCharacter(int[] bits) {
        int n =bits.length,i=0;
        while (i<n-1){
            if (bits[i]==0){
                i++;
            }
            else {
                i+=2;
            }
        }
        return i==n-1;
    }
}
