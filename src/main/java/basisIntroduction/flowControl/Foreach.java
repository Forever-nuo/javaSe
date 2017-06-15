package basisIntroduction.flowControl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forever on 2017-6-15.
 */
public class Foreach {

    /***
     * foreach语法
     * for(元素类型 元素变量 : 遍历的元素集合对象){}
     */
    @Test
    public void testYuFa() {

        List<String> strs = new ArrayList<>();
        strs.add("23");
        strs.add("11");
        strs.add("45");
        for (String str : strs) {
            str = "2233";
        }
        System.out.println(strs);
    }

    /***
     * foreach的局限性
     * 遍历的时候 只能获取
     * 不能对集合中的元素进行操作
     */
    @Test
    public void testConfine() {

        List<String> strs = new ArrayList<>();
        strs.add("23");
        strs.add("11");
        strs.add("45");
        for (String str : strs) {
            System.out.println(str);
            str = "2233";
        }
        System.out.println(strs);
    }

    /**
     * 数组的foreach循环
     */
    @Test
    public void test() {
        int[] arr = {333, 232, 55};
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
