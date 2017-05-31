package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 赋值运算符
 * = 不是 等于 而是赋值
 * +=
 * -=
 * *=
 * /=
 * %=
 * Created by forever on 2017-4-9.
 */
public class AssignmentOperator {

    @Test
    public void test() {
        /**
         * 将右边的 3  赋值给 左边 i
         */
        int i = 3;

        /**
         * 将右边的3 和左边 i 的和 赋值给i
         * 和i=i +3 差不多
         */
        i += 3;
    }

    @Test
    public void test1() {
        /**
         * short i = 3;
         * i +=3; 和 i=i+3;的区别
         */
        short i = 3;
        /**
         * 编译不通过
         * 左边 i+3  自动提升为int 类型 结果为int 类型
         * 右边变量i 是short类型  大类型不能赋值给小类型 ,编译不通过(需要进行强制转换)
         */
        //i = i + 3;
        /**
         * 编译通过
         * += 是一个赋值运算
         * 和 short i= 4; 差不多 看在不在这个范围内  在的话 会进行隐式的自动转换
         */
        i += 3;

        String str1, str2;
        str2 = str1 = "11";

        System.out.println(str1);
        System.out.println(str2);

    }
}
