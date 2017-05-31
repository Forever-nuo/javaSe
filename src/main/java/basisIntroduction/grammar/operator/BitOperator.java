package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 位运算符
 * 位运算符主要针对二进制，它包括了：“与”、“非”、“或”、“异或”,"左移","右移","无符号移动"
 * 从表面上看似乎有点像逻辑运算符
 * 但逻辑运算符是针对两个关系运算符来进行逻辑运算，
 * 而位运算符主要针对两个二进制数的位进行逻辑运算。
 * Created by forever on 2017-4-9.
 */
public class BitOperator {

    /**
     * <<左移
     */
    @Test
    public void test() {
        /**
         * 6 先转成2进制数  : 110
         * 然后左移3位  低位补0 : 11000  十进制数:48
         * 6*2^3 = 48
         */
        int x = 6;
        int i = 6 << 3;
        System.out.println(Integer.toBinaryString(6));//110
        System.out.println(x);
        System.out.println(i);
    }

    /**
     * >>右移
     */
    @Test
    public void test2() {
        /**
         * 6 先转成2进制数  : 110
         * 然后左移2位  高位补原来的数 (正数补0,负数补1): 000 十进制数:0
         * 6/2^3 = 0
         */
        int x = 6;
        int i = -6 >> 2;
        System.out.println(Integer.toBinaryString(6));//110
        System.out.println(x);
        System.out.println(i);

    }

    @Test
    public void test3() {
        int x = 8, y = 16, temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }

    /***
     * 2个整数变量的值 进行互换不要第三方变量
     */
    @Test
    public void test4() {
        int x = 8, y = 9;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }

    @Test
    public void test5() {
        int x = 8, y = 9;
        x = x ^ y;
        y = x ^ y;//(x^y )^y
        x = y ^ x;//(x^y)^y^(x^y)
        System.out.println(x);
        System.out.println(y);
    }

}
