package basisIntroduction.grammar.variable;

import org.junit.Test;

/**
 * 什么时候定义变量
 * 1.值不确定的时候
 * 2.对数据进行存储
 * <p/>
 * Created by forever on 2017-4-9.
 */
public class Variable {

    int x; //成员变量  不管有没有显式的进行初始化,jvm虚拟器都会先自动给它自动初始化值

    public static void main(String[] args) {
        int x1 = 2;
        x1 = x1 + 2; //局部变量  参与运算 声明的时候就必须初始化值

        int y2 = 3;
        System.out.println(y2); //局部变量 参与输出 声明的时候也要初始化值

        int y;
        y = x1 + 2;
        System.out.println(y); //局部变量  接受一个表达式的值 声明的时候可以不初始化值

    }

    /**
     * 定义一个变量 可以分为2步
     * 1.声明一个变量
     * 2.初始化一个变量 给变量赋值
     */
    @Test
    public void test() {
        /***
         * 声明变量的时候
         * 1.要指定变量的数据类型
         * 2.同类型的变量可以1一个或多个
         */
        int x1, x2;
        /**
         * 赋值的时候 可以把同一个值赋值多个变量
         */
        x1 = x2 = 1;
        /**
         * 等价于
         */
        x1 = 1;
        x2 = 1;
    }

}
