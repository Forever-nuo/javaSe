package Thread.joinThread;

/**
 * Created by forever on 2017-6-6.
 */
public class JoinThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 70; i++) {
            System.out.println(Thread.currentThread().getPriority() + "..." + i);
        }
    }
}


class JoinDemo{

    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        Thread thread1 = new Thread(joinThread);
        Thread thread2 = new Thread(joinThread);
        thread1.start();
        thread1.join();   //执行到这段代码的时候  主线程 进入冻结状态  当线程1执行完的时候 //主线程才会开启
        thread2.start();
       // thread1.join(); //执行到这段代码的时候  主线程 进入冻结状态  当线程1执行完的时候 //主线程才会开启
        for (int i = 0; i < 80; i++) {
            System.out.println("主线程"+i);
        }
        System.out.println("over.....");
    }
}