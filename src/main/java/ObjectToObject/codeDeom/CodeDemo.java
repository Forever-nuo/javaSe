package ObjectToObject.codeDeom;

import org.junit.Test;

/**
 * Created by forever on 2017-4-17.
 */
public class CodeDemo {
    static  {
        System.out.println( "demo的静态代码块 主函数上");
    }
    @Test
    public void test() {
        Person.show();  //类就加载了
        new Person();
        new Person();
    }
    static  {
        System.out.println( "demo的静态代码块 主函数下");
    }

    /**
     * 类没有加载
     */
    @Test
    public void test1() {
        Person person =null; //此时类不会加载
    }

    /**
     * 类加载 情况1
     */
    @Test
    public void test2() {
        Person.show();
    }

    /**
     * 类加载 情况 2
     */
    @Test
    public void test3() {
        new Person().show1();
    }
}
