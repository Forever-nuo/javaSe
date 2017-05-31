package basisIntroduction.grammar.typeConversion;

import org.junit.Test;

/**
 * 基本数据类型转换
 * Created by forever on 2017-4-9.
 */
public class TypeConversion {

    /**
     * 自动类型提升
     */
    @Test
    public void Test1() {
        /**
         * 当进行算术运算或者位运算的时候
         * 1.会先把 左边的都转换成统一的类型 (其中最大的数据类型) 向上提升
         * 2.然后统一之后 才能进行 运算
         * 3.最后的结果 类型 就是最大的提升后的类型
         */
        byte b1 = 3;
        int i1 = 5;
        long l1 = 8;
        long l2 = l1 + b1 + i1;
        System.out.println(l2);
    }

    /**
     * 小范围整型数据类型的 接受  大范围的整型值
     */
    @Test
    public void Test2() {
        /**
         * 整型默认的是int 类型
         * 隐式转换
         */
        int i = 56;
        byte b1 = 25;  //只要数值在类型的范围内 会自动隐式转换
        byte b2 = 127;
        // byte b3 = 128; //如果数值超过了范围内 就自动转换不了
        /***
         * 浮点型 默认的是double 型
         */
        //float f = 12.8;  //double型的值 来float的变量来接受 需要进行强制转换
    }

    /**
     * 小范围的整型数据类型  接受大范围的整型数据类型变量
     */
    @Test
    public void test3() {
        /**
         * 整型
         */
        int i = 56;
        byte b = (byte) i;//byte 型的变量接受 一个int型的变量需要显示的 进行强制转换
    }

    /***
     * float 类型 (小范围的浮点类型) 接受 大范围的浮点类型值(double )
     */
    @Test
    public void test4() {
        /**
         * 浮点类型常量数值 默认是double 类型
         */
        float f = (float) 12.5;
    }

    /**
     * 强制转换  向下转型
     */
    @Test
    public void test5() {
        byte b = 3;
        // b = b+3;  左边是 byte 类型  右边是int类型
        /**
         * 如果一定用 小类型 接受 大类型的 需要进行 强制转换(只发生在向下转型中)
         * 注意 强制转换会出现 精度丢失的情况
         */
        b = (byte) (b + 3);
    }

    /**
     * 强制转换 精度丢失 截尾
     */
    @Test
    public void test6() {
        /**
         * 结果 为3
         * 7/2 =3.5
         * int 类型 截取 小数点后面的数
         * 只去整数部分
         */
        int i = 7;
        System.out.println(i / 2);

        /**
         * 结果为 8
         */
        double b = 8.66;
        System.out.println((int) b);
    }

    /**
     * 字符和 整数的运算
     */
    @Test
    public void test7() {
        /**
         * 结果为66  'A' 字符A 对应的整数是65
         * char 类型(2字节) int(4字节) 向上转型 成int 型
         */
        char c = 'A';
        System.out.println(c + 1);

        /***
         * 如何得到98 对应的字符
         *
         * 向下转型(char)即可v
         * 结果为'b'
         */
        System.out.println((char) 98);

    }

}
