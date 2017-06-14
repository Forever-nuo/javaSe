package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by forever on 2017-6-13.
 */
public class ListError {

    /***
     * 泛型解决的问题
     *
     * 避免了强制转换的问题
     */
    @Test
    public void test() {
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("113331");
        list.add(3);
        for (Object o : list) {
            System.out.println(((String) o).length());
        }
    }

    @Test
    public void testGeneric() {
        List<String> list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("113331");
      //  list.add(3);   编译时会报错
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next().length();
        }
    }

}
