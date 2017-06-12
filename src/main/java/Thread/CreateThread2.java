package Thread;

/**
 * 创建方式2
 * 1.实现runnable接口
 * 2.实现run方法
 * 3.创建线程对象 , 创建runnable 的实现对象 作为参数
 * 4.启动线程,start方法 调用 runnable的实现对象的run方法
 * Created by forever on 2017-6-4.
 */
public class CreateThread2 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {

            if (ticketNum > 0)

                System.out.println(Thread.currentThread().getName()+":正在卖票" + ticketNum--);
        }
    }

    public static void main(String[] args) {
        CreateThread2 createThread2 = new CreateThread2(); //创建实现runnable接口的对象
        Thread t1 = new Thread(createThread2, "窗口1"); //创建线程对象, runnable的子类对象最为参数  共享的同一个runnable子类对象
        Thread t2 = new Thread(createThread2, "窗口2");
        Thread t3 = new Thread(createThread2, "窗口3");
        Thread t4 = new Thread(createThread2, "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
