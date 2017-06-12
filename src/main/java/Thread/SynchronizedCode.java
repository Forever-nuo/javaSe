package Thread;

/**
 * 同步代码块
 * synchronized(对象){
 *     需要同步的代码....
 * }
 * Created by forever on 2017-6-4.
 */
public class SynchronizedCode implements Runnable {

    private int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                   /* try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(Thread.currentThread().getName() + "窗口1出售:" + num--);
                }
            }
        }
    }


    public static void main(String[] args) {
        SynchronizedCode synchronizedCode = new SynchronizedCode();
        new Thread(synchronizedCode,"窗口1").start();
        new Thread(synchronizedCode,"窗口2").start();
        new Thread(synchronizedCode,"窗口3").start();
        new Thread(synchronizedCode,"窗口4").start();
    }
}
