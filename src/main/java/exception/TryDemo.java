package exception;

import org.junit.Test;

/**
 * Created by forever on 2017-5-18.
 */
public class TryDemo {

    /***
     * try的三种格式
     *
     * 1.try{}catch(异常类型 异常参数){}
     * 2.try{}catch(异常类型 异常参数){}finally{}
     * 3.try{}finally{}
     */

    /**
     * 必须要执行的代码 放在finally中
     * 哪怕没有异常
     */
    @Test
    public void test() {
        try {

        } finally {

        }
    }


}
