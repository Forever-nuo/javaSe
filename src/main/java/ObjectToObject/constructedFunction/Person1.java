package ObjectToObject.constructedFunction;

/**
 * 显示无参构造函数
 * Created by forever on 2017-4-17.
 */
public class Person1 {
    private int age;
    private String name;

    public Person1() {
        System.out.println("无参构造函数被调用");
        return;
    }

    public Person1(int age, String name) {
        this.age = age;
        this.name = name;


    }

    public String  Person1(){

        return "不是构造函数!一般函数";
    }
}
