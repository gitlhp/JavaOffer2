package 剑指Offer;

/**
 * @ClassName: Singleton02
 * @Description:单例模式-双重检验锁
 * @Author: lhp
 * @Date: 2020/3/9 23:10
 * @Version: V1.0
 **/
public class Singleton02 {
    private Singleton02(){}
    private static volatile Singleton02 singleton02;
    public static Singleton02 getInstance(){
        if (singleton02 ==null){
            synchronized (Singleton02.class){
                if (singleton02 ==null){
                    singleton02 = new Singleton02();
                }
            }
        }
        return singleton02;
    }
}
