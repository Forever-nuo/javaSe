package basisIntroduction.flowControl;

import org.junit.Test;

/**
 * Created by forever on 2017-4-10.
 */
public class IfDemo {

    /**
     * 只有if语句 条件满足
     */
    @Test
    public void test1() {
        int x = 3;
        if (x > 2) {    //条件满足  执行语句块里 的语句
            System.out.println(1);
            System.out.println(2);
        }
        System.out.println(3);
    }

    /**
     * 只有if语句 条件不满足
     */
    @Test
    public void test2() {
        int x = 3;
        if (x > 5) {    //false   不执行语句块里的语句
            System.out.println(1);
            System.out.println(2);
        }
        System.out.println(3);
    }

    /**
     * if else 语句
     */
    @Test
    public void test3() {
        int x = 3;
        if (x > 2) {
            System.out.println(1);
            System.out.println(2);
        } else {
            System.out.println(11);
            System.out.println(22);
        }
        System.out.println(3);
    }

    /**
     * if else if语句
     * <p/>
     * 从上往下判断 boolean表达式
     * 如果为true 执行之后的语句块
     * 其他的语句块就不进行判断  哪怕条件满足
     */
    @Test
    public void test4() {
        int x = 3;
        if (x > 2) {
            System.out.println(1);
            System.out.println(2);
        } else if (x > 1) {
            System.out.println(11);
            System.out.println(22);
        }
        System.out.println(3);
    }

    /**
     * if else if else  else 是可选语句
     */
    @Test
    public void test5() {
        int x = 3;
        if (x > 2) {
            System.out.println(2);
        } else if (x > 1) {
            System.out.println(11);
            System.out.println(22);
        } else {
            System.out.println(333);
            System.out.println(222);
        }
        System.out.println(3);
    }

    /**
     * 如果语句块中 是简单语句 只有1条语句
     * 那么 可以省略{}(代码块 语句块)
     */
    @Test
    public void test6() {
        int x = 3;
        if (x > 7)
            System.out.println(2);
        else if (x > 1)
            System.out.println(11);
        else {
            System.out.println(333);
            System.out.println(222);
        }
        System.out.println(3);
    }

    @Test
    public void test7() {

        int x = 5;

        if (x > 2)
            System.out.println(2);
        if (x > 3)
            System.out.println(3);
        if (x > 5)
            System.out.println(5);

        if (x > 2)
            System.out.println(2);
        else if (x > 3)
            System.out.println(3);
        else
            System.out.println(5);

    }

    @Test
    public void test8() {

        int x = 3;
        /**
         * 如果if else 代码块中的 代码一致 可以进行改造
         */
        if (3 == x)
            System.out.println("3-5中的数");
        else if (4 == x)
            System.out.println("3-5中的数");
        else if (5 == x)
            System.out.println("3-5中的数");

        /**
         * 使用逻辑运算符 链接多个逻辑表达式(boolean表达式)
         * 改造如下
         */
        if (3 == x || 4 == x || 5 == x)
            System.out.println("3-5中的数");

    }

    /**
     * if return 语句 替代 if else 语句
     * <p/>
     * 如果代码是 if else
     * e
     */
    public void returnString() {
        int x = 3;
        if (x > 5) {
            System.out.println("333");
            return;
        }
        System.out.println("11");
    }

    public void elseString() {
        int x = 3;
        if (x > 5) {
            System.out.println("3333");
            System.out.println("333");
        } else {
            System.out.println("11");
            System.out.println(222);
        }
    }

    @Test
    public void test() {

    }

}
