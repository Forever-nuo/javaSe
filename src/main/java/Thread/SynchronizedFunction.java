package Thread;

/**
 * Created by forever on 2017-6-4.
 */
public class SynchronizedFunction implements Runnable {

    private Bank bank = new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.add(100);
        }
    }

    public static void main(String[] args) {
        SynchronizedFunction synchronizedFunction = new SynchronizedFunction();

        new Thread(synchronizedFunction, "客户1").start();
        new Thread(synchronizedFunction, "客户2").start();

    }
}
