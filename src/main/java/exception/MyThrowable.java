package exception;

import org.junit.Test;

/**
 * Created by forever on 2017-5-15.
 */
public class MyThrowable {
    @Test
    public void test()  {
        Throwable throwable = new Throwable();
        try {
            throw  throwable;
        } catch (Throwable throwable1) {
            throwable1.printStackTrace();
        }
       /* try {

        }*/
    }

    /**
     * throws 异常 声明异常,使用在方法上,抛出异常 可以交给虚拟机处理
     * 1.try catch块就行堆异常对象进行处理
     * 2.throws 抛给更广的范围 最顶层虚拟机处理
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        throw new Exception();
    }
}
