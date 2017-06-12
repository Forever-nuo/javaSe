package Thread;

/**
 * Created by forever on 2017-6-6.
 */
public class InnerClassThread {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 90; i++) {
                    System.out.println("线程1" + i);
                }
            }
        }.start();
        for (int i = 0; i < 90; i++) {
            System.out.println("主线程" + i);
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 90; i++) {
                    System.out.println("线程2" + i);
                }
            }
        };
        new Thread(r).start();
    }
}
