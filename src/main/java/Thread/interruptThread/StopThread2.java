package Thread.interruptThread;

/**
 * Created by forever on 2017-6-5.
 *
 * 停止线程 特殊情况 都进入冻结状态
 * 读取不到改变的状态标志
 * 也就不能结束线程
 */
public class StopThread2 implements Runnable {
    private boolean flag = true;

    @Override
    public synchronized void run() {
        int x = 0;
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"............."+ x++);
        }
    }

    void changeFlag() {
        this.flag = false;
    }

    public static void main(String[] args) {
        StopThread2 stopThread2 = new StopThread2();
        Thread thread2 = new Thread(stopThread2);
        Thread thread1 = new Thread(stopThread2);
        thread1.start();
        thread2.start();
        int x = 0;
        while(true){
            if(x==60){
                stopThread2.changeFlag();
                break;
            }
            System.out.println( Thread.currentThread().getName()+"主线程"+x++);
        }
        System.out.println("over");
    }
}
