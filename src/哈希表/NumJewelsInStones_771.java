package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: NumJewelsInStones_771
 * @Description
 * @Author: lhp
 * @Date: 2020/2/27 17:07
 * @Version: V1.0
 **/
public class NumJewelsInStones_771 {
    public int numJewelsInStones1(String J, String S) {
        int n = 0;
        for (int i=0;i<S.length();i++){
            if (J.indexOf(S.charAt(i))!=-1){
                n++;
            }
        }
        return n;
    }
    public int numJewelsInStones11(String J, String S) {
        int result = 0;
        char[] js = J.toCharArray();
        char[] ss = S.toCharArray();
        Set set = new HashSet<>(js.length);
        for (char j : js) {
            set.add(j);
        }
        for (char s:ss){
            if (set.contains(s)){
                result++;
            }
        }
        return result;
    }

}
