package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型的上限
 * <? extends 类>
 * 只接受类和类的子类
 * Created by forever on 2017-6-14.
 */
public class GenericExtends<T> {

    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("张三1"));
        list.add(new Student1("张三2"));
        list.add(new Student1("张三3"));
        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("赵武1"));
        list2.add(new Student1("赵武2"));
        list2.add(new Person("赵武3"));
        List<Object> list3 = new ArrayList<>();
        list3.add(new Object());
        list3.add(new Object());
        list3.add(new Object());
        show(list2);
    }

    void show1(Collection<? extends T> c){

    }
    public static void show(List<? extends Person> list) {
        Iterator<? extends Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

    }
}


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student1 extends Person {
    private String name;

    public Student1(String name) {
        super(name);
    }
}