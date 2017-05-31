package ObjectToObject.thisDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-4-18.
 */
public class ThisDemoTest {
    @Test
    public void test() {
        Person person1 = new Person(3);
        Person person2 = new Person(4);
        boolean b = person1.sameAge(person2);
    }
}
