package Thread.interruptThread;

/**
 * Created by forever on 2017-6-5.
 */
public class StopThread3 implements Runnable {
    private boolean flag = true;

    @Override
    public synchronized void run() {
        int x = 0;
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                flag = false;
            }
            System.out.println(Thread.currentThread().getName() +"............."+ x++);
        }
    }

    void changeFlag() {
        this.flag = false;
    }

    public static void main(String[] args) {
        StopThread3 stopThread1 = new StopThread3();
        Thread thread1 = new Thread(stopThread1);
        Thread thread2 = new Thread(stopThread1);
        thread1.start();
        thread2.start();
        int x = 0;
        while(true){
            if(x==60){
                thread1.interrupt();
                thread2.interrupt();
                break;
            }
            System.out.println( Thread.currentThread().getName()+"主线程"+x++);
        }
        System.out.println("over");
    }
}
