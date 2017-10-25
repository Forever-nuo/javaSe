package CollectionAndMap.Collection.List;

import org.junit.Test;

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
        list.add(new Person("张三1", 35));
        list.add(new Person("张三2", 36));
        list.add(new Person("张三3", 37));
        list.add(new Person("张三1", 35));
        list.add(new Person("张三3", 35));

        List<Person> list1 = new ArrayList<>();
        for (Person person : list) {
            if (!list1.contains(person)) {
                list1.add(person);
            }
        }
        System.out.println(list1);
    }

    /***
     * 情况1:集合a{a,b,c} 集合b{a,b} true
     * 情况2:集合a{a,b,c} 集合b{a,d} false
     * 情况3:集合a{a,b,c} 集合b{a,b,c,d} false
     */
    @Test
    public void testContainsAll() {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        System.out.println(list1.containsAll(list2));
    }


    /**
     * addNull
     */
    @Test
    public void testAddNullToList() {
        List<String> nameList = new ArrayList<>();
        nameList.add("name1");
        nameList.add(null);
        nameList.add("name1");
        nameList.add(null);
        nameList.add(null);

        System.out.println(11);
    }


    @Test
    public void testRemoveNullFromList() {
        List<String> nameList = new ArrayList<>();
        nameList.add("name1");
        nameList.add(null);
        nameList.add("name1");
        nameList.add(null);
        nameList.add(null);


        //移除list中的null值 方式1


  /*      for (ListIterator<String> stringListIterator = nameList.listIterator(); stringListIterator.hasNext(); ) {
            String next = stringListIterator.next();
            if (next == null) {
                stringListIterator.remove();
            }
        }*/

        //方式2
        List<String> nullList = new ArrayList<>();
        nullList.add(null);

        nameList.removeAll(nullList);


        System.out.println(11);
    }


    @Test
    public void testIsNullList() {
        List<String> nameList = new ArrayList<>();

        nameList.add(null);

        nameList.add(null);
        nameList.add(null);

        if (nameList!=null&&nameList.size()>0){
            System.out.println(1111);
        }

        System.out.println(11);
    }


}



