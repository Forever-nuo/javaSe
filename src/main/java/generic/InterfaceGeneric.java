package generic;

import java.util.Comparator;

/**
 * 泛型接口
 * Created by forever on 2017-6-13.
 */
public class InterfaceGeneric  {

    /***
     * 实现泛型接口的时候 子类没有明确泛型
     */
    private class myCompator1<T> implements Comparator<T>{

        @Override
        public int compare(T o1, T o2) {
            return ((String)o1).compareTo((String)o2);
        }
    }


    /***
     * 实现或继承接口(父类)的时候明确(接口父类上的)泛型
     */
    private class myCompator2 implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }


    /***
     * 不显示泛型 就是Object类型
     */
    private class myCompator3 implements  Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

}
