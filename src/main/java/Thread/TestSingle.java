package Thread;

import org.junit.Test;

/**
 * Created by forever on 2017-6-4.
 */
public class TestSingle implements Runnable {


    @Override
    public void run() {
        System.out.println(Single1.getSingle1());
    }

    public static void main(String[] args) {
        TestSingle testSingle = new TestSingle();
        new Thread(testSingle).start();
        new Thread(testSingle).start();
        new Thread(testSingle).start();
        new Thread(testSingle).start();
        new Thread(testSingle).start();
        new Thread(testSingle).start();
        new Thread(testSingle).start();


    }
}
