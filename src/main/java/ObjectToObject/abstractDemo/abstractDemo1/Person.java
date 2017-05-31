package ObjectToObject.abstractDemo.abstractDemo1;

/**
 * Created by forever on 2017-4-22.
 */
public abstract class Person {
    public int x;

    /**
     *abstract只能修饰类和方法
     * 不能修饰成员变量
     */
   // abstract String name ="变量可以抽象么";
    abstract  void show(Person person);

    /**
     * 抽象类中有构造函数?
     * 只有是类 就有构造函数 哪怕是抽象类
     * 接口 没有构造函数
     */
    public Person() {
    }
}
