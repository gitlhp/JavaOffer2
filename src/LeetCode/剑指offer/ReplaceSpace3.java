package LeetCode.剑指offer;

/**
 * @ClassName: ReplaceSpace3
 * @Description:替换空格
 * @Author: lhp
 * @Date: 2020/4/15 11:00
 * @Version: V1.0
 **/
public class ReplaceSpace3 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
