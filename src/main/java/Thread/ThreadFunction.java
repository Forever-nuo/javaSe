package Thread;

import org.junit.Test;

/**
 * Created by forever on 2017-6-4.
 */
public class ThreadFunction extends Thread {
    public ThreadFunction() {
        super();
    }

    public ThreadFunction(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 70; i++)
        /**
         * 获取线程名称
         */
            System.out.println(currentThread().getId()+"线程" + getName() + ":+++++++++++++" + i);
    }


    public static void main(String[] args) {
        ThreadFunction t1 = new ThreadFunction();
        ThreadFunction t2 = new ThreadFunction();
        t1.start();
        t2.start();

        /**
         * 通过构造函数设置 线程的名称
         */
        ThreadFunction t = new ThreadFunction("wwe");
        t.start();


        /**
         * 通过set方法设置线程的名称
         */
        ThreadFunction tSetName2 = new ThreadFunction();
        tSetName2.setName("线程名称2");
        tSetName2.start();


        /***
         * 获取当前线程
         * 静态方法
         */

        System.out.println( tSetName2.currentThread().getName()); //main方法

        /**
         * 线程的start方法只能调用一次
         */
        ThreadFunction tStart = new ThreadFunction("111");
        tStart.start();
        tStart.start();
    }

    /**
     * start 方法只能调用一次
     */
    @Test
    public void testStart() {

    }

}
