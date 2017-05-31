package ObjectToObject.innerClass;

import org.junit.Test;

/**
 * Created by forever on 2017-5-8.
 */
public class InnreDemoTest {
    @Test
    public void test() {
        Outer.Inner4 inner4 = new Outer().new Inner4();
        inner4.function1();
        inner4.function2();
        inner4.function3();
    }

    /**
     * 访问 static 静态内部类
     */
    @Test
    public void test2() {
        new Outer.StaticInner().notify();
        Outer.StaticInner.show2();
    }
}
