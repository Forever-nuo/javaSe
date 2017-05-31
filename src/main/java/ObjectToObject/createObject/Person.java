package ObjectToObject.createObject;

/**
 * Created by forever on 2017-4-20.
 */
public class Person {
    static String country = "加拿大";
    private int age;
    private String name="李四";

    static {
        System.out.println("静态代码块");
        show1();
        country="中国";
    }
    public static void show1(){
        System.out.println("静态方法");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    {
        System.out.println("构造代码块");
        System.out.println("默认初始化" + age);
        age = 4;
        System.out.println("构造代码块初始化" + age);
    }

    public Person() {
        System.out.println("无参构造函数");
    }

    public Person(int age, String name) {
        System.out.println("age:" + this.age + ",name:" + this.name);
        this.age = age;
        this.name = name;
        System.out.println("age:" + this.age + ",name:" + this.name);
        System.out.println("有参构造函数");
        {
            System.out.println("普通代码块");
        }
    }

    public static void main(String[] args) {
        Person person = new Person(3,"张三");
        person.setAge(5);
        Person person1 =new Person(4,"王五");
        person1.getAge();
        person1.getAge();
    }
}
