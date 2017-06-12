package Thread.threadFunction;

/**
 * Created by forever on 2017-6-6.
 */
public class PriorityThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 700; i++)
            System.out.println(Thread.currentThread().toString() + "..." + i);
    }

    public static void main(String[] args) {
        PriorityThread priorityThread = new PriorityThread();
        Thread t1 = new Thread(priorityThread);
        Thread t2 = new Thread(priorityThread);
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY); //优先权 抢到cpu 的几率高的 不表示就一定抢到
        t2.setPriority(Thread.MIN_PRIORITY); //默认为5  最高为10 最低为1
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().toString() + "..." + i);
        }
        System.out.println("over");
    }
}
