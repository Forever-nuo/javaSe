package Thread;

/**
 * Created by forever on 2017-6-4.
 */
public class ThisLock implements Runnable {
    public boolean flag = true;
    private int num = 100;
    private Object object = new Object();

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (object) {
                    if (num > 0) {
                        try {
                            Thread.sleep(4);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "true出售:" + num--);
                    }
                }
            }
        } else {
            while (true) {
                show();
            }
        }

    }
    synchronized void show() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "flase出售:" + num--);
        }
    }

    public static void main(String[] args) {
        ThisLock thisLock = new ThisLock();
        new Thread(thisLock,"窗口1").start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thisLock.flag=false;
        new Thread(thisLock,"窗口2").start();
    }
}
