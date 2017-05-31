package ObjectToObject.duoTaiDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-5-6.
 */
public class InstanceOfDemo {

    /**
     * 看一个对象是否属于某个类型
     * 1.instance of 方法
     * 2.对象.class 类.class 是否相等
     */
    @Test
    public void testInstanceOf() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println(dog instanceof Dog);
        System.out.println(dog.getClass()== dog1.getClass());
    }

}
