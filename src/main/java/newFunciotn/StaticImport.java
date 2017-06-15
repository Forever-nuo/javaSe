package newFunciotn;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;


/**
 * 新特性
 * 静态导入
 * Created by forever on 2017-6-15.
 */
public class StaticImport {
    @Test
    public void test() {
        asList();
        String st = "1332";

    }


    /***
     *静态导入的同名方法
     */
    @Test
    public void testSameFunction() {
        toString();  //object中方法
        Arrays.toString(new int[]{1123, 32});
    }


}
