package ObjectToObject.thisDemo;

import lombok.Data;
import org.junit.Test;

/**
 * Created by forever on 2017-4-17.
 */
@Data
public class Person {
    private Mouth mouth;
    private int age;
    private String name;

    public Person() {
        mouth = new Mouth();
        System.out.println();
    }

    /**
     * this(参数列表) : 调用其他构造函数
     *
     * @param age
     */
    public Person(int age) {
        this();


        this.age = age;
    }

    public Person(int age, String name) {
        this(age);
        this.name = name;
        this.show();//表示当前对象 this.成员变量 在本类中使用
    }

    private void show() {
        mouth.speak(this);
        System.out.println("1111");
    }

    /**
     * 是否同龄人
     */
    public  boolean sameAge(Person person) {
        return this.age == person.age;
    }


}
