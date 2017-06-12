package CollectionAndMap.Collection.List;

import org.junit.Test;
import sun.awt.datatransfer.DataTransferer;
import sun.java2d.pipe.SpanIterator;

import java.util.*;

/**
 * Created by forever on 2017-6-8.
 */
public class ArrayListDemo {

    /***
     * 去除集合中的重复元素
     * 方式1 用set集合的特性
     */
    @Test
    public void testRemoveSame() {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java1");
        list.add("java2");
        Set set = new HashSet(list);


    }


    /**
     * 遍历原来的容器
     * 用一个新的容器
     * 存放每一个元素
     * 存放元素前 判断新容器是否包含该元素
     */
    @Test
    public void testRemoveSame1() {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java1");
        list.add("java2");
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (!list1.contains(s))
                list1.add(s);
        }
        System.out.println(list1);
    }


    /***
     * 自定义对象的remove方法
     *
     */
    @Test
    public void testRemoveSame2() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三1",35));
        list.add(new Person("张三2",36));
        list.add(new Person("张三3",37));
        list.add(new Person("张三1",35));
        list.add(new Person("张三3",35));

        List<Person> list1 = new ArrayList<>();
        for (Person person : list) {
            if(!list1.contains(person)){
                list1.add(person);
            }
        }
        System.out.println(list1);
    }
}



