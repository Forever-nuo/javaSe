package CollectionAndMap.Collection.Set;

import com.sun.org.apache.xpath.internal.axes.BasicTestIterator;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by forever on 2017-6-12.
 */
public class SetDemo {

    @Test
    public void testIterator() {
        Set<String> set = new HashSet<>();
        set.add("张三1");
        set.add("张23事物");
        set.add("323");
        set.add("张23事物3");
        set.add("java01");
        set.add("java02");

        /***
         * set集合 没有 list集合的 遍历get方法
         * 只能通过 foreach 循环
         * 和Iterator获取元素
         */
        for (String s : set) {
            System.out.println(s);
        }

        for (Iterator<String> iterator = set.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
