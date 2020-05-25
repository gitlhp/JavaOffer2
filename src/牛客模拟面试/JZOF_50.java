package 牛客模拟面试;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JZOF_50
 * @Description:面试题50. 第一个只出现一次的字符
 * @Author: lhp
 * @Date: 2020/3/8 21:15
 * @Version: V1.0
 **/
public class JZOF_50 {
    public char firstUniqChar(String s) {
        if (s.length()==0||s==null){
            return ' ';
        }
        Map<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i =0;i<chars.length;i++) {
            if (map.get(String.valueOf(chars[i])) == null) {
                map.put(String.valueOf(chars[i]), 1);
            } else {
                map.put(String.valueOf(chars[i]), map.get(String.valueOf(chars[i])) + 1);
            }

        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(String.valueOf(chars[i]))==1){
                return chars[i];
            }
        }
        return ' ';
    }
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0||str==null){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i = 0; i < str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        JZOF_50 jzof_50 = new JZOF_50();
        String s = "abssa";
        System.out.println(jzof_50.FirstNotRepeatingChar(s));

    }
}
