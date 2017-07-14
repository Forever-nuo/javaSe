package IO.otherIo;

import lombok.core.PublicApiCreatorApp;

import java.io.Serializable;

/**
 * Created by forever on 2017-6-28.
 */
public class Person implements Serializable {
    /**
     * 添加序列化
     * 如果修改类文件 还可以反序列化对象
     */
    private static final long serialVersionUID = -24138029208470282L;
    private int age;
    private String name;
    /***
     * 静态成员 不能被序列化
     */
    public  static String country = "cn";

    /***
     * 非静态的数据 不想被序列化
     * 可以使用 transient 关键字
     */
    transient  int sex ;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
