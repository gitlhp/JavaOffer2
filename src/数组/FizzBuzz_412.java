package 数组;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FizzBuzz_412
 * @Description
 * @Author: lhp
 * @Date: 2020/2/27 21:57
 * @Version: V1.0
 **/
public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if (i%3==0&&i%5!=0){
                list.add("Fizz");
            }
            else if (i%3!=0&&i%5==0){
                list.add("Buzz");
            }
            else if (i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz_412 fizzBuzz_412 = new FizzBuzz_412();
        for (String str : fizzBuzz_412.fizzBuzz(3)) {
            System.out.println(str);
        }
    }
}
