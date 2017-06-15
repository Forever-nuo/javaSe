package CollectionAndMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by forever on 2017-6-15.
 */
public class ArraysDemo {

    /*****************************************************asList方法***********************************/

    /**
     * 数组是基本数据类型
     * 会将数组做为结合中的元素
     */
    @Test
    public void testAsList1() {
        int[] arr = {1,2,3};
        List<int[]> ints = Arrays.asList(arr);
    }

    /***
     * 数组中的元素 是引用数据类型
     *
     */
    @Test
    public void testAsList2() {
        Integer[] arr ={1,23,5};
        List<Integer> integers = Arrays.asList(arr);
    }

    /***
     * 数组转成list 不能进行增删操作
     *
     * 会报java.lang.UnsupportedOperationException
     */
    @Test
    public void testAsList3() {
        Integer[] arr ={1,23,5};
        List<Integer> integers = Arrays.asList(arr);
        integers.add(3);
    }


    /***
     * 解决方案
     * 创建一个新的集合
     * 再进行增删操作
     */
    @Test
    public void testAsList4() {
        Integer[] arr ={1,23,5};
        List<Integer> integers = Arrays.asList(arr);
        List<Integer> newInteger = new ArrayList<>(integers);
        newInteger.add(3);
    }
}
