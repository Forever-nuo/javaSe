package ObjectToObject.packageDemo; //放在java文件的第一行


import org.junit.Test;

/**
 * Created by forever on 2017-6-3.
 */
public class packageDemo1  extends  DefaultDemo2{
    @Test
    public void test() {
        /***
         * 同一个包中
         * 子类能直接访问 除了private 修饰的成员
         *
         * 不同包中
         * 子类能直接访问 只能访问 public 和protected修饰的类
         *
         *
         * 同一个包中
         * 只能访问 能访问 public 和default修饰的修饰的类
         *
         * 不同包中
         * 只能访问public 修饰的类 和public 修饰的成员
         */
        function();
    }


    @Test
    public void testPrivate() {
        PublicDemoA publicDemoA = new PublicDemoA();


        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.function();

        DefaultDemo2 defaultDemo2 = new DefaultDemo2();
        defaultDemo2.function();


    }
}

