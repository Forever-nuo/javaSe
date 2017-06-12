package CollectionAndMap.Collection.Set;

import org.junit.Test;

import java.util.HashSet;

/**
 * Created by forever on 2017-6-8.
 */
public class HashSetDemo {

    @Test
    public void testHashCode() {

        /**
         * hashset辨别不同的元素
         * 1.先比较哈希值是否相同 hashcode方法
         * 2.如果相同继续比较 equals方法
         */
        HashSet<Person> set = new HashSet();
        set.add(new Person(3,"张三"));
        set.add(new Person(3,"张三1"));
        set.add(new Person(3,"张三2"));
        set.add(new Person(3,"张三2"));
        System.out.println(set);
    }


}
