package ObjectToObject.duoTaiDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-5-2.
 */
public class Demo {
    @Test
    public void test1() {
        Animal dog = new Dog();
        dog.eat();
        function(new Cat());
    }

    /**
     * 向下转型
     * 父类引用 强制转成子类类型
     * (只能转成引用所指向的实际对象类型)
     */
    @Test
    public void test2() {
        Animal animal = new Animal();
        Cat c = (Cat) animal;
        c.eat();
    }

    @Test
    public void test3() {
        Animal animal = new Cat();
        Dog dog1 = (Dog) animal;
    }

    /**
     * 向下转型
     * 可以访问 转型后的成员
     */
    @Test
    public void test4() {
        Animal animal = new Cat();
        //  animal.catchMouse();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.eat();
        cat.catchMouse();
    }

    @Test
    public void test() {
        Object object = new Animal();
        Animal animal = (Animal) object;
        animal.eat();
    }

    @Test
    public void testInstance() {

    }

    /****
     * instance of
     * 数据类型的类型判断 是否属于某个类型
     * ==
     * 值的判断
     *
     * @param animal
     */
    void function(Animal animal) {
        //不要判断父类类型
        if (animal instanceof Animal) {
            System.out.println(111);
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
            dog.kanjia();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        }

        animal.eat();
    }

    /***
     * 多态中的成员变量
     */
    @Test
    public void testVariable() {
        Animal animal = new Cat();
        System.out.println(animal.x); // 3
        Cat cat = (Cat) animal;
        System.out.println(cat.x); //4
    }

    @Test
    public void testStaticFunction() {
        Animal animal = new Cat();
        animal.method();   //调用的父类方法
    }
}
