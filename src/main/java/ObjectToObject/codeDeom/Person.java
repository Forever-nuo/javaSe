package ObjectToObject.codeDeom;

/**
 * Created by forever on 2017-4-17.
 */
public class Person {
    private int age;

    static {
        System.out.println("静态代码块加载");
    }

    {
        System.out.println(222);
    }

    public Person() {
        System.out.println(333);
    }

    public Person(int age) {
        this();
        this.age = age;

    }


    public static void show(){
        System.out.println("普通方法");
        {
            System.out.println("普通代码块");
        }
    }
    public void show1(){
        System.out.println("普通方法");
        {
            System.out.println("普通代码块");
        }
    }

    {
        System.out.println(111);
    }
}
