package ObjectToObject.ObjectDemo;

import ObjectToObject.thisDemo.Person;
import org.junit.Test;

/**
 * Created by forever on 2017-5-6.
 */
public class ObjectDemo {

    /**
     * equals 方法 比较的对象的地址值
     */
    @Test
    public void testEquals() {
        Person1 person1 = new Person1();
        Person1 person11 = new Person1();
        System.out.println(person1.equals(person11));//false
        Person1 person2 = person1;
        System.out.println(person2.equals(person1));
        System.out.println(person1 == person11);
    }

    /**
     * object的toString方法
     */
    @Test
    public void testToString() {
        Object object1 = new Object();


        System.out.println(object1.toString());
        String str[] = new String[3];
        System.out.println(str.toString());

        Person2 person2 = new Person2("张三",15);
        System.out.println(person2.toString());
    }
}
