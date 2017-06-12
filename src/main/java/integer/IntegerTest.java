package integer;

import org.junit.Test;

/**
 * Created by forever on 2017-6-7.
 */
public class IntegerTest {
    /***
     * int类型的最大值
     */
    @Test
    public void testMAX_VALUE() {
        System.out.println(Integer.MAX_VALUE);
    }

    /**
     * 基本数据类型 转字符串
     */
    @Test
    public void testIntToString() {

        int a = 98;
        /**
         * 方式1
         */
        String string = "" + a;
        /**
         * 方式2
         */
        String s = String.valueOf(a);
        /**
         * 方式3
         */
        String string1 = Integer.toString(a);
    }


    /**
     * 字符串转 基本数据类
     */
    @Test
    public void testStringToInt() {
        String str = "56";
        Integer a = Integer.valueOf("56");  //字符串转换成 包装类

        /***
         * 基本数据类型对象  转换成  基本数据类型
         */
        int i1 = a.intValue();
        int i = Integer.parseInt(str);   //字符串转换成 基本数据类型

    }


    /***
     * 进制转换
     */
    @Test
    public void testCase() {
        /**
         * 十进制 转换成其他进制
         */
        String string = Integer.toBinaryString(18);//10010  2进制
        String string1 = Integer.toHexString(18);//12     16进制
        String string2 = Integer.toOctalString(18);//22   8进制


        /***
         * 其他进制转换成 10进制
         * 参数1,其他进制的字符串形式,
         * 参数2,参数1的表现形式
         */
        int i = Integer.parseInt("3c", 16);//60
        Integer a = 34;


    }

    /**
     * 位运算
     */
    @Test
    public void test() {
        int i = Integer.rotateLeft(10, 2);
        int b = Integer.rotateRight(10, 2);
        /***
         *   // 例如1000
         i |= (i >>  1); // 使前2位变为1，相当于i = i | (i >> 1); i = 1000 | 0100 = 1100
         i |= (i >>  2); // 使前4位变为1，由于上一步确保了前两位都是1，所以这一次移动两位，1111
         i |= (i >>  4); // 使前8位变为1，1111
         i |= (i >>  8); // 使前16位变为1，1111
         i |= (i >> 16); // 使前32位变为1，1111
         return i - (i >>> 1); // i >>> 1 无符号右移，使最高位为0，其余位为1，相减即得出结果，1111 - 0111 = 1000
         */
                Integer.highestOneBit(3);
    }

    /**
     * equals
     */
    @Test
    public void testEquals() {
        Integer a = new Integer("3");
        Integer b = new Integer("3");
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true
    }


    /***
     * 自动装箱和拆箱
     */
    @Test
    public void testBox() {

        Integer a = 3;  //  Integer a = new Integer(3); 装箱
        int b =a ;      //  int b = a.IntValue(); 拆箱

    }

    /***
     * 注意装箱拆箱的null值
     *
     * 会空指针异常
     */
    @Test
    public void testBoxNull() {
        Integer a = null;
        int b =a ;
    }
}
