package ObjectToObject.constructedFunction;

import org.junit.Test;

/**
 * Created by forever on 2017-4-17.
 */
public class ConstructedFunctionDemo {

    @Test
    public void test() {
        Person3 person3 = new Person3();
    }

    @Test
    public void test1() {
        // Person2 person2 = new Person2();  不能通过无参构造函数 创建对象
        Person2 person2 = new Person2(3, "jack");
    }

    @Test
    public void test2() {
        Person2 p = new Person2(3, "angel");
    }

    @Test
    public void test3() {
        Person1 p1 = new Person1();
    }
}
