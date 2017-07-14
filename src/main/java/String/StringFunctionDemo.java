package String;

import org.junit.Test;

/**
 * Created by forever on 2017-6-6.
 */
public class StringFunctionDemo {

    @Test
    public void testEquals() {
        String  str = "abc";
        String  str2 = "abc";
        str.equals(str2);
    }


    /**************************获取方法********************/

    /**
     * 获取字符串长度
     */
    @Test
    public void testLength() {
        String  str = "abc";
        System.out.println( str.length());
    }

}
