package ObjectToObject.packDemo2;

import ObjectToObject.packageDemo.ProtectedDemo;
import ObjectToObject.packageDemo.PublicDemoA;
import org.junit.Test;



/**
 * Created by forever on 2017-6-3.
 */
public class Demo1 extends ProtectedDemo {

    @Test
    public void test() {
        PublicDemoA publicDemoA = new PublicDemoA();
        ProtectedDemo protectedDemo = new ProtectedDemo();

        function();
    }

    /**
     * 不同包中, public class
     */
    @Test
    public void testPublicClass() {
        PublicDemoA publicDemoA = new PublicDemoA();

        publicDemoA.publicFunction();
       // publicDemoA.defaultFunction(); 不可以访问
       // publicDemoA.protectedFunction();不可以访问


    }

    /**
     * 不同包中同名类
     * 在同一个类中 使用 不同包同名类
     * 必须写全类名
     */
    @Test
    public void testDefaultPackageSameClass() {
        DefaultDemo2 defaultDemo2 = new DefaultDemo2();  //该类是pac
        ObjectToObject.ObjectDemo.DefaultDemo2 defaultDemo21 = new ObjectToObject.ObjectDemo.DefaultDemo2();
    }


}
