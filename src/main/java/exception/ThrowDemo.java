package exception;

import org.junit.Test;

/**
 * Created by forever on 2017-5-17.
 */
public class ThrowDemo {
    @Test
   void  function () throws Exception {
        System.out.println(11);
        throw new Exception();
   }

    @Test
    public void testFunction() throws MyException {
        System.out.println(111);
        throw  new  MyException();
    }


    /***
     * 自定义异常 必须继承throwable中的体系
     * throwable中体系的类和 其他类的区别
     * 只有throwable中的类有可抛性:throw 或throws使用
     */

    @Test
    public void test() throws Exception {
        throw new Exception();
     //   throw new String();

    }

    /***
     * 使用在代码块中的异常
     * 只能try catch
     */

    {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * 抛出异常后 当前执行语句后的代码不会执行
     * throw 手动抛出
     * 相等于 一个return ;
     * 后面不能有代码
     */
    @Test
    public void test2() {
        System.out.println(111);
        throw new RuntimeException();
        //System.out.println(222);
    }
}
