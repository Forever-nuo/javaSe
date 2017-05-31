package ObjectToObject.staticDemo;

/**
 * Created by forever on 2017-4-18.
 */
public class Person {
    public static String country = "中国";
    int age;

    public void show() {
        System.out.println(Person.country);
    }

    public static void take() {
        System.out.println("take静态方法");
        //System.out.println(age);
    }

}
