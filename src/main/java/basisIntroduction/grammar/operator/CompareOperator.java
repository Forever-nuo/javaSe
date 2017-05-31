package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 比较运算符
 * Created by forever on 2017-4-9.
 */
public class CompareOperator {
    /**
     * 比较运算符 有: ==,!=,>,>=,<,<=,instance of
     * 比较运算符 的结果 都是boolean值 要么true 要么false
     */
    @Test
    public void test() {

        System.out.println(3 > 4); //结果false

        /**
         * instance of的用法
         * 判断 某个实现类是否是某个类  多态中的实现类的判断
         *
         * 语法
         * boolean  result = object instanceof class(类)
         * Result：布尔类型。
         * Object：必选项。任意对象表达式。
         * class：必选项。任意已定义的对象类。
         */
        Object a = new String();
        Object b = new Integer(3);
        boolean x = a instanceof Integer;
        System.out.println(x);
    }
}
