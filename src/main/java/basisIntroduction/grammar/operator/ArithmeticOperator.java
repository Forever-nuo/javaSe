package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 算术运算符
 * Created by forever on 2017-4-9.
 */
public class ArithmeticOperator {

    @Test
    public void testAdd() {
        /**
         * +号 2个作用
         * 1.数值+数值 当做加法运算
         * 2.字符串+任何数据  当做拼接字符串运算
         *   先将数据都转成字符串 然后进行拼接 最后结果是字符串
         */
        int a = 3;
        int b = 5;
        System.out.println(a + b); //8
        System.out.println(a + "" + b);//35
    }

    @Test
    public void testSubtract() {

    }

    /**
     * 取模 %取余数
     */
    @Test
    public void test1() {

        /**
         * 取模 就是取 余数
         * 1.如果被除数 大于 除数 结果 为余数 (余数肯定比除数小)
         * 如果被除数 小于 除数 结果  余数为被除数
         *
         * 2.如果有负数  只看被除数
         * 如果被除数 为正数 除数(正或负) 结果都为正数
         * 如果被除数 为负数 除数(正或负) 结果都为负数
         */
        System.out.println(5 % 2); //结果为1
        System.out.println(2 % 5); //结果为2
        System.out.println(-2 % 5);//结果为-2
        System.out.println(-2 % -5); // 结果为-2
        System.out.println(2 % -5); //结果为2
    }

    @Test
    public void test2() {
        /**
         * 字符 2个字节(1字节8位)
         *''中 长度为1 转移符长度为2
         */
        // char c1 = 'a';
        //char c2 = 'av';//会报错
        char c3 = '\b';
        char c4 = '\\';
        /**
         * 一个汉字 2个字节
         */
        char c5 = '过';
        System.out.println(c3);
        System.out.println(c5+1);
    }
}
