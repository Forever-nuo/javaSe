package CollectionAndMap.Collection.Set;

import org.junit.Test;

import java.util.*;

/**
 * Created by forever on 2017-6-12.
 */
public class TreeSetDemo {

    /***
     * treeSet 存取按自然顺序
     */
    @Test
    public void testTreeSet() {

        TreeSet<String> set = new TreeSet<>();
        set.add("bbbc");
        set.add("bbba");
        set.add("aacd");
        set.add("eeccc");

        for (String s : set) {
            System.out.println(s);
        }
    }

    /***
     * treeSet存储自定义对象
     */
    @Test
    public void test() {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person(3, "张三1")); //添加
        set.add(new Person(34, "张三2")); //添加34  和 3比较 大于34 排后面
        set.add(new Person(4, "张三2"));  //添加4 和3比较 大于0 排在3后面 和34比较 排在34前面
        for (Person person : set) {
            System.out.println(person);
        }
    }

    /***
     * 让容器自身具有比较性
     * 构造函数
     */
    @Test
    public void testComparetor() {

        TreeSet<Person> set = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.valueOf(((Person) o1).getAge()).compareTo(Integer.valueOf(((Person) o2).getAge()));
            }
        });
        set.add(new Person(3, "张三1")); //添加
        set.add(new Person(34, "张三2")); //添加34  和 3比较 大于34 排后面
        set.add(new Person(4, "张三2"));  //添加4 和3比较 大于0 排在3后面 和34比较 排在34前面
        for (Person person : set) {
            System.out.println(person);
        }
    }

    @Test
    public void nullSet() {

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person(3, "name1");
        Person person2 = new Person(1, "name2");
        Person person3 = new Person(null, "name3");
        Person person4 = new Person(null, "name4");
        Person person5 = new Person(5, "name5");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        //创建比较器
        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
        Collections.sort(personList, personAgeComparator);


        //查找之前先排序 不要是乱序的
        Person personKey = new Person(3, "name5");
        int index = Collections.binarySearch(personList, personKey, personAgeComparator);
        Person person = personList.get(index);
        PersonNameComparator personNameComparator = new PersonNameComparator();

        //重新比较器查询  要重新排序
        Collections.sort(personList, personNameComparator);
        int index2 = Collections.binarySearch(personList,personKey,personNameComparator);
        Person person6 = personList.get(index2);
        System.out.println("");

    }

    /**
     *
     */
    class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            Integer o1Age = o1.getAge();
            Integer o2Age = o2.getAge();
            //比较器要注意null值的情况
            if (o1Age == null || o2Age == null) {
                return -1;
            }
            return o1Age.compareTo(o2.getAge());
        }
    }

    class PersonNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {

            return o1.getName().compareTo(o2.getName());
        }
    }


}
