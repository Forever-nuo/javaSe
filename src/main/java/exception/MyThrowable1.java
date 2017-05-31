package exception;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import junit.extensions.TestSetup;
import org.junit.Test;

/**
 * 异常的处理
 * Created by forever on 2017-5-15.
 */
public class MyThrowable1 {

    /***
     * 没有try catch 处理异常 抛给虚拟机处理异常
     * 1.代码出现异常  在堆内存上 new Exception对象  然后弹出对象
     * 异常处理机制,寻找时候的异常处理程序块 catch块
     * 2.异常之后 代码3处不会执行(当前执行路径后的代码不会执行)
     *
     * @param x
     * @param y
     */
    public void chufa(int x, int y) {
        System.out.println("异常之前"); //代码1
        System.out.println(x / y); //代码2
        System.out.println("异常之后"); //代码3
    }

    @Test
    public void test() {
        chufa(3, 0);
    }


    /****
     * 使用try catch 处理异常
     */
    @Test
    public void test1() {
        try { //异常监控程序
            System.out.println("try catch 处理异常");
            chufa(3, 0);   //代码1 发生异常处   堆内存new ArithmeticException();
            System.out.println("111"); //代码2 不执行
        } catch (Exception e) { //捕获异常 异常处理程序  Exception e = new ArithmeticException();
            System.out.println("进入到异常处理程序"); //处理异常的代码块
            e.printStackTrace(System.out);
        }
        System.out.println("处理完之后可以执行的代码"); //处理完后可以继续执行的代码
    }

    /***
     * catch 块中抛出异常
     * 1要么再进行try catch 进行处理
     * 2在方法上抛出异常
     * (1).在其他地方进行处理 try catch
     * (2).交给虚拟机
     * 3catch 块后的代码不能执行
     *
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        try { //异常监控程序
            System.out.println("try catch 处理异常");
            chufa(3, 0);   //代码1 发生异常处   堆内存new ArithmeticException();
            System.out.println("111"); //代码2 不执行
        } catch (Exception e) { //捕获异常 异常处理程序  Exception e = new ArithmeticException();
            System.out.println("进入到异常处理程序"); //处理异常的代码块
            e.printStackTrace(System.out);
            throw new Exception(e);
        }
        System.out.println("处理完之后可以执行的代码"); //处理完后可以继续执行的代码
    }

    /**
     * catch的匹配
     */
    @Test
    public void test3() {
        try {
            System.out.println("111");
            chufa(3, 0);
        } catch (ArithmeticException e1) {
            System.out.println("符合条件的接受异常");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("角标越界异常");
        } catch (Exception e) {
            System.out.println("Exception 接受异常");
        }
        try {
            System.out.println("111");
            chufa(3, 0);
        } catch (Exception e) {
            System.out.println("Exception 接受异常");
        }/* catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("角标越界异常");
        }*/
    }

    /**
     * 如果没有catch到异常 就抛给了虚拟机
     */
    @Test
    public void test4() {
        try {
            chufa(3,0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
        }
        System.out.println(222);
    }

    /***
     * catch 块中抛出runtime异常
     * 1.不需要再try catch 或者声明异常
     */
    @Test
    public void test5() {
        try {
            chufa(3,0);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException("33");
        }
        System.out.println(222);
    }


}


