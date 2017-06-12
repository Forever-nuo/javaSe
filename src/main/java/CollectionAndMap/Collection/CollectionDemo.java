package CollectionAndMap.Collection;

import CollectionAndMap.Collection.List.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * 本类 测试 collection集合的通用方法
 * Created by forever on 2017-6-8.
 */
public class CollectionDemo {

    /***
     * 往集合中添加元素
     */
    @Test
    public void testAdd() {
        ArrayList<Integer> list = new ArrayList<>();

        /**
         * 往集合中末尾添加一个元素
         */
        list.add(2);


        list.add(0, 3);
        list.addAll(0, list);
        list.addAll(list);
    }

    /***
     * 获取集合的长度
     */
    @Test
    public void testSize() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0, 3);
        System.out.println(list.size());
    }


    /***
     * 集合存放元素的注意点
     */
    @Test
    public void testAdd1() {
        ArrayList arrayList = new ArrayList();
        Person person = new Person();
        for (int i = 0; i < 6; i++) {
            person.setName("张三" + i);
            person.setAge(i);
            arrayList.add(person);
        }
    }


    /**
     * 存放元素2
     */
    @Test
    public void testAdd2() {
        ArrayList arrayList = new ArrayList();
        Person person;
        for (int i = 0; i < 6; i++) {
            person = new Person();
            person.setName("张三" + i);
            person.setAge(i);
            arrayList.add(person);
        }
    }


    /**
     * 删除集合中的某元素
     */
    @Test
    public void testRemove() {
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        arrayList.remove(4);
    }

    @Test
    public void testRemoveAll() {
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        ArrayList arrayList1 = new ArrayList();

        for (int i = 3; i < 2; i++) {
            arrayList1.add(i);
        }
        arrayList.removeAll(arrayList1);
    }

    /***
     * 清空集合
     */
    @Test
    public void testClear() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.clear();
    }


    /**
     * 集合是否为空
     */
    @Test
    public void testIsEmpty() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.clear();

        /**
         * 集合是否为空
         *  return size == 0;
         */
        System.out.println(list.isEmpty());
    }

    /***
     * 取交集
     */

    @Test
    public void testRetain() {

        ArrayList list1  = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList list2 = new ArrayList();
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list1.retainAll(list2);
        System.out.println( list1);
    }


    /****
     * iterator 遍历方法的示例
     */
    @Test
    public void testIterator() {
        ArrayList list1  = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        Iterator iterator=list1.iterator() ;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
