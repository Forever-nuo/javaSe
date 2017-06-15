package newFunciotn;

import org.junit.Test;

/**
 * 新特性
 * <p/>
 * 可变参数
 * Created by forever on 2017-6-15.
 */
public class ChangeParameter {

    /***
     * 需求加法运算
     * 2个数相加
     * 3个数相加
     */


    /*****
     * 第一种: 方法的重载
     */
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


    /**
     * 第2种: 数组做参数
     */
    int add2(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }


    @Test
    public void testAdd2() {
        int[] arr = {1, 2, 4};
        System.out.println(add2(arr));
    }


    /***
     * 第3种可变数组
     */
    int add3(int... arr) {
        int result = 0;
        for (int i : arr)
            result += i;
        return result;
    }

    /***
     * 可变参数
     *
     * 将数组参数 可变参数的形式
     * 语法:(数组类型... 变量);
     * 会将元素参数 封装成数组  变量就指向这个数组
     */
    @Test
    public void testAdd3() {
        System.out.println(add3(21,233,5523));
        System.out.println(add3(21,233,5523,32));
    }

    /***
     *1.只能定义一个可变数组
     *2.混合使用,且可变数组要放到参数列表的最后
     */
    int add4(String str,int... arr){
        return 0;
    }

   /* int add5(int...arr,String...str){
        return 22;
    }*/
}
