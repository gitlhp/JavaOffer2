package 剑指Offer;

/**
 * @ClassName: ReplaceBlank04
 * @Description:替换字符串中的空格
 * @Author: lhp
 * @Date: 2020/3/9 23:19
 * @Version: V1.0
 **/
public class ReplaceBlank04 {
    public String replaceSpace(StringBuffer str){
        if (str.length()==0||str==null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' '){
                stringBuilder.append(str.charAt(i));
            }else {
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReplaceBlank04 replaceBlank04 = new ReplaceBlank04();
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        System.out.println(replaceBlank04.replaceSpace(stringBuffer));
    }
}
