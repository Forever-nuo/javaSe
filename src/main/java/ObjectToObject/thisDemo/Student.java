package ObjectToObject.thisDemo;

/**
 * 构造函数间死循环
 * Created by forever on 2017-4-18.
 */
public class Student {
    private int age;
    private String name;

    public Student() {
        this(3);
    }

    public Student(int age) {
        this.age = age;
    }
}
