package Thread.threadFunction;

/**
 *
 * Created by forever on 2017-6-6.
 */
public class YieldThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 700; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().toString() + "..." + i);
        }


    }

    public static void main(String[] args) {
        YieldThread YieldThread = new YieldThread();
        Thread t1 = new Thread(YieldThread);
        Thread t2 = new Thread(YieldThread);
        t1.start();
        t2.start();
      //默认为5  最高为10 最低为1
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().toString() + "..." + i);
        }
        System.out.println("over");
    }
}