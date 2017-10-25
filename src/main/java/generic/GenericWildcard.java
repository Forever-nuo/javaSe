package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forever丶诺 on 2017-10-25.
 */
public class GenericWildcard {

    public <T> void print(List<T> t1) {
    }


    public void print1(List<?> t2) {
    }


    /**
     * 会相同的方法 擦除
     * <p>
     * 一样的方方法
     *
     * @param t2
     */
   /* public void print2(List<String> t2) {
    }*/
    public void print2(List<Integer> t2) {
    }


    @Test
    public void test() {
        List<?> list1 = new ArrayList<String>();
        list1 = new ArrayList<Integer>();

        // list1 = new ArrayList<?>();

    }

/*
    public void test1(List<?> list) {
        list.add("aaa");
        list.add(1);
    }*/



}
