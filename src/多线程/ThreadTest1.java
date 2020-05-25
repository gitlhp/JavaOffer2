package 多线程;

/**
 * @ClassName: ThreadTest1
 * @Description
 * @Author: lhp
 * @Date: 2020/3/11 11:27
 * @Version: V1.0
 **/


public class ThreadTest1 implements Runnable {
    int i = 1;
    public static void main(String[] args) {
        ThreadTest1 t = new ThreadTest1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 先唤醒另外一个线程
                notify();
                try {
                    Thread.currentThread();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    try {
                        // 打印完之后，释放资源，等待下次被唤醒
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
