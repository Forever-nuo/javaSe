package commonFunction;

import basisIntroduction.grammar.operator.TernaryOperator;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

/**
 * Created by forever on 2017-6-19.
 */
public class SystemTest {


    /***
     * 获取打印流
     */
    @Test
    public void testOut() {
        PrintStream f = System.out;
    }


    /**
     * 获取输入流 键盘录入
     */
    @Test
    public void testIn() {
        InputStream in = System.in;
    }

    /**
     * 会把系统的属性全部加载进来
     */
    @Test
    public void testGetProperties() {
        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey()+"::::::"+entry.getValue());
        }
    }


    /***
     * 可以当设置全局变量
     */
    @Test
    public void testSetProperty() {
        System.setProperty("myKey","myValue");
    }
}
