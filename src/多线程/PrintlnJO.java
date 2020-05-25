package 多线程;

/**
 * @ClassName: PrintlnJO
 * @Description:两个线程交替打印奇偶数
 * @Author: lhp
 * @Date: 2020/3/11 10:03
 * @Version: V1.0
 **/
public class PrintlnJO {
    //1.不加锁控制变量 不加volatile容易产生死锁
//    private static volatile boolean flag = true;
//
    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 1000; ) {
//                    if (flag) {
//                        if (i % 2 != 0) {
//                            System.out.println(i);
//                            i+=2;
//                            flag = false;
//                        }
//                    }
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                for (int i = 2; i <= 1000; ) {
//                    if (!flag) {
//                        if (i % 2 == 0) {
//                            System.out.println(i);
//                            i+=2;
//                            flag = true;
//                        }
//                    }
//                }
//            }
//        });
//        t1.start();
//        t2.start();
        run run = new run();
        new Thread(run).start();
        new Thread(run).start();
    }
    public static class run implements Runnable{
        int i = 0;
        @Override
        public void run() {
            while (true){
                synchronized (this){
                    this.notify();
                    while (i<=100){
                        System.out.println("线程"+Thread.currentThread().getName()+"执行了"+i);
                        i++;
                        try {
                            System.out.println("线程"+Thread.currentThread().getName()+"开始释放锁");
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
}
