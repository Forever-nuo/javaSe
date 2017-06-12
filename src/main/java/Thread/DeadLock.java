package Thread;

import ObjectToObject.ObjectDemo.DefaultDemo2;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * Created by forever on 2017-6-4.
 */
public class DeadLock implements Runnable {

    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true)
                synchronized (DeadLock.class) {
                    System.out.println("if locka");
                    synchronized (MyLock.object2) {
                        System.out.println("if lockb");
                    }
                }
        } else {
            while (true)
                synchronized (MyLock.object2) {
                    System.out.println("else lockb");
                    synchronized (DeadLock.class) {
                        System.out.println("else locka");
                    }
                }
        }
    }
}

class MyLock {
    static Object object1 = new Object();
    static Object object2 = new Object();
}

class Demo {
    public static void main(String[] args) {
        new Thread(new DeadLock(true)).start();
        new Thread(new DeadLock(false)).start();
    }
}
