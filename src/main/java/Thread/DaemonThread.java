package Thread;

/**
 * Created by forever on 2017-6-5.
 */
public class DaemonThread implements Runnable
{
    @Override
    public void run() {
        while(true){
            System.out.println("1111111");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        Thread thread1 =  new Thread(daemonThread);
        Thread thread2 =  new Thread(daemonThread);

        /**
         * 设置守护线程
         * 1.要在启动start线程之前 设置为守护线程
         * 主线程是前台线程
         *
         * 当所有的线程都执行完
         * 所有的守护线程也就结束
         * 即只有 后台线程时(守护线程)所有后台线程也会结束 jvm退出
         */
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        int x =0;
        while(true){
            if(x==500){
                thread1.interrupt();
                thread2.interrupt();
                break;
            }
            System.out.println( Thread.currentThread().getName()+"主线程"+x++);
        }
        System.out.println("over");


    }
}
