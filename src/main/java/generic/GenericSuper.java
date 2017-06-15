package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by forever on 2017-6-14.
 */
public class GenericSuper {

    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("张三1"));
        list.add(new Student1("张三2"));
        list.add(new Student1("张三3"));
        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("赵武1"));
        list2.add(new Student1("323"));
        list2.add(new Person("赵武3"));
        List<Object> list3 = new ArrayList<>();
        list3.add(new Object());
        list3.add(new Object());
        list3.add(new Object());
        show(list);
    }

    /***
     * 泛型的下限  就不能用下限的特有方法
     * 因为下限 可以接受Object 的泛型
     * 所以 只能用Object中有的方法
     * @param list
     */
    public static void show(List<? super Student1> list){
        Iterator<? super Student1> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
