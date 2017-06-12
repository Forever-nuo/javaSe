package Thread;

/**
 * 静态方法的锁 是类的class对象
 * Created by forever on 2017-6-4.
 */
public class StaticFunctionLock implements Runnable {
    public boolean flag = true;
    private static int num = 100;
    private Object object = new Object();

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (StaticFunctionLock.class) {
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
  static   synchronized void show() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "flase出售:" + num--);
        }
    }

    public static void main(String[] args) {
        StaticFunctionLock thisLock = new StaticFunctionLock();
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
