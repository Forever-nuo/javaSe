package exception;

import org.junit.Test;

/**
 * throws 声明异常
 * Created by forever on 2017-5-16.
 */
public class ThrowsDemo {
    /***
     * 异常声明格式
     * 参数列表后 throws 异常类型列表(异常1,异常2)
     */
    public void function1(int x) throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println(x);
    }


    /**
     * 异常声明的参数列表,有继承关系 可以省略子类异常类型
     */
/*    public void function2(int x) throws ArrayIndexOutOfBoundsException, Exception {
        System.out.println(x);
    }*/
    public void function2(int x) throws Exception {
        System.out.println(x);
    }


    /***
     * RunTimeException 异常
     * 可以不捕获或声明异常
     *
     * @param x
     * @throws RuntimeException
     */
    public void function4(int x) throws RuntimeException {
        System.out.println(x);
    }

    /**
     * 一个方法内 调用了一个声明异常的方法(不是runtime类型的异常)
     * 就会抛出异常
     * 就需要捕获异常
     * 或者继续抛出
     */
    public void function3() throws Exception {
        try {
            function2(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void function5() {
        function4(3);
    }

    /**
     * 非runtime 异常需要进行处理
     * try catch 或继续抛出
     */
    public void function6() {
        try {
            throw new Exception("333");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * runtime 异常 可以不进行处理
     */
    public void function7() {
        throw new RuntimeException();
    }


    /***
     *声明异常 的作弊
     *
     */
    void function8() throws Exception {
        System.out.println();
    }


    void functionManyException(int x ,int y) throws ArrayIndexOutOfBoundsException,ArithmeticException {
        int [] arr = new int[x];
        System.out.println(arr[5]);
        System.out.println(x/y);
    }

    @Test
    public void testFunctionManyException() {
        try {
            functionManyException(2,0);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("111");
        }catch (ArithmeticException e){
            System.out.println("222");
        }

    }

}
