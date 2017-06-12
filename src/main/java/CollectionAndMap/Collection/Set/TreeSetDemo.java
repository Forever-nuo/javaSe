package CollectionAndMap.Collection.Set;

import org.junit.Test;

import java.util.TreeSet;

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
            System.out.println( s);
        }
    }

    /***
     * treeSet存储自定义对象
     */
    @Test
    public void test() {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person(3,"张三1")); //添加
        set.add(new Person(34,"张三2")); //添加34  和 3比较 大于34 排后面
        set.add(new Person(4,"张三2"));  //添加4 和3比较 大于0 排在3后面 和34比较 排在34前面
        for (Person person : set) {
            System.out.println(person);
        }
    }

}
