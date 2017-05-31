package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 三元运算符
 * Created by forever on 2017-4-10.
 */
public class TernaryOperator {

    /**
     * 如果返回类型是 boolean类型
     */
    @Test
    public void test() {
        int x = 3, y = 4;
        boolean flag = x > y;
    }

    /**
     * 如果返回类型 非boolean类型
     */
    @Test
    public void test1() {
        int x = 3, y = 4;
        int max = (x > y) ? x + y : y - 4;
    }

    /**
     * if else 的内容只有一条语句 可以用 三元运算符
     */
    @Test
    public void test2() {
        int x = 3, y = 5, max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println(max);
        max = (x > y) ? x : y;
    }

    /**
     * return 返回值
     * 1.可以返回一个变量
     * 2.可以返回一个表达式 表达式结果是一个值
     *
     * @return
     */
    public int getMax() {
        int x = 3, y = 5;

        Object object;
        object = (x > y) ? new String("11") : new Exception();

        return (x > y) ? x : y;
    }
}
