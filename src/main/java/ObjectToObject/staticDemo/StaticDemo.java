package ObjectToObject.staticDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-4-18.
 */
public class StaticDemo {

    public static void main(String[] args) {
        Person person = new Person();
        String country = person.country;
    }

    /**
     * 静态成员的访问
     */
    @Test
    public void test() {
        Person person = new Person();
        String country = person.country;
        System.out.println(country);
        System.out.println(Person.country);
        Person.take();
    }
}
