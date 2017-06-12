package Thread;

import org.junit.Test;

/**
 * 自定义线程方式1
 * 1.创建一个类 继承Thread类
 * 2.复写run方法
 * Created by forever on 2017-6-4.
 */
public class CreateThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 70; i++)
            System.out.println("线程1:+++++++++++++" + i);
    }


    /**
     * jvm执行
     * 主线程: 创建一个CreateThread1 线程对象
     * start方法 启动线程 调用run方法
     *
     * cpu在主线程 和 CreateThread1  线程 之间切换
     *
     * 一个程序:当一个线程结束时,另一个线程还会执行 当所有线程全结束时,线程才会结束
     *
     *
     * 每次结果都不一样 :随机性
     *
     * @param args
     */
    public static void main(String[] args) {
        new CreateThread1().start();

    }

    /***
     * run方法的执行
     *
     * 本示例其实只有1主线程
     */
    @Test
    public void testThreadRunFunction() {
        CreateThread1 createThread1 = new CreateThread1();  //创建线程
        createThread1.run();  //调用线程的run方法    但是并没有启动线程  所以启动线程必须调用start方法!
        for (int i = 0; i < 72; i++) {
            System.out.println("主线程++++++++++++++++++"+i);
        }
    }



}
