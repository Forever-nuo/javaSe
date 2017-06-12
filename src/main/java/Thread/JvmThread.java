package Thread;

/**
 * Created by forever on 2017-6-3.
 */
public class JvmThread {


    /***
     * jvm 执行中有2两个线程
     *
     * 主线程:执行java程序 从上而下执行
     * 执行过程中  对象会被垃圾回收机制 回收 , 这也是个线程
     * 这样就有2个执行路径: 主线程 和 垃圾回收的线程  多个执行路径 就是多线程
     * @param args
     */
    public static void main(String[] args) {

        /***
         * 主线程 从上而下 执行代码
         * 过程中
         * 垃圾回收的线程 会回收 不再内存中的对象
         */
            String str = new String("1111" );

        Object object = new Object();

        System.out.println(111);

    }

}
