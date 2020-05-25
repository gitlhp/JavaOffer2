package 多线程;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName: test
 * @Description
 * @Author: lhp
 * @Date: 2020/3/11 11:52
 * @Version: V1.0
 **/
public class test {
    private static Object object = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            int i=0;
            @Override
            public void run() {
                synchronized(object){
                    object.notify();
                    while (i<100){
                        if (i%2==0){
                            System.out.println(i);
                            i++;
                        }else {
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            int i=0;
            @Override
            public void run() {
                synchronized(object){
                    object.notify();
                    while (i<100){
                        if (i%2!=0){
                            System.out.println(i);
                            i++;
                        }else {
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }).start();
    }
}
