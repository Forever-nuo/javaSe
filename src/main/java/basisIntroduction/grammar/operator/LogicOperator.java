package basisIntroduction.grammar.operator;

import org.junit.Test;

/**
 * 逻辑运算符 有: &,|,!,^,&&,||
 * 逻辑运算符 连接多个boolean表达式
 * Created by forever on 2017-4-9.
 */
public class LogicOperator {

    /**
     * && 短路与
     */
    @Test
    public void test() {
        int i = 5;

        boolean result = i > 2 && i < 7; // i>2 true  i<7  true
        System.out.println(result); //true

        result = i > 2 && i < 3; //i>2 true i<3 false
        System.out.println(result); // false

        /**
         * 短路与 有一个为false 则结果为false 全为true才为true
         */
    }

    /**
     * || 短路或
     */
    @Test
    public void test2() {
        int i = 5;

        boolean result = i > 2 || i < 7; // i>2 true  i<7  true
        System.out.println(result); //true

        result = i > 2 || i < 3; //i>2 true i<3 false
        System.out.println(result); // true

        result = i > 6 || i < 3; //i>6 false i<3 false
        System.out.println(result); //false

        /**
         * 短路 或 有一个true 则为true 全为false 才为false
         */
    }

    /**
     * &普通与
     */
    @Test
    public void test3() {
        int i = 5;

        boolean result = i > 2 & i < 7; // i>2 true  i<7  true
        System.out.println(result); //true

        result = i > 2 & i < 3; //i>2 true i<3 false
        System.out.println(result); // false
    }

    /**
     * 普通或 |
     */
    @Test
    public void test4() {
        int i = 5;
        boolean result = i > 2 | i < 7; // i>2 true  i<7  true
        System.out.println(result); //true

        result = i > 2 | i < 3; //i>2 true i<3 false
        System.out.println(result); // true

        result = i > 6 | i < 3; //i>6 false i<3 false
        System.out.println(result); //false
    }

    /**
     * ! 取反
     */
    @Test
    public void test5() {
        int i = 5;
        boolean result = i > 6; //false
        System.out.println(!result);//true

        result = i < 6;//true
        System.out.println(!result);//false
    }

    /**
     * ^ 异或
     */
    @Test
    public void test6() {
        /**
         * 结果一样为false
         * 不一样 为true
         */
        int i = 5;
        boolean result ;
    /*    boolean result = i > 2 ^ i < 7; // i>2 true  i<7  true
        System.out.println(result); //false

        result = i > 2 ^ i < 3; //i>2 true i<3 false
        System.out.println(result); // true

        result = i > 6 ^ i < 3; //i>6 false i<3 false
        System.out.println(result); //false*/
        /**
         * true^true^false^false;
         * 1.true-true =false;
         * 2.false,false,false
         * 3.false-false=false;
         * 3,false,false
         * 4.false-false =false
         * 结果false
         */
        result = true^true^false^false;// true -true = false , false-false-false ,false-false=false; false-false,
        System.out.println(result);
    }

    /**
     * 短路&&和& 短路||和|的区别
     * 一般逻辑判断用短路 &&和||
     */
    @Test
    public void test7() {
        int i = 5;

        if (i > 6 && i > 7 / 0) {  //i>6 false  只要为false 就执行后面的语句 没报异常
            System.out.println("111");
        }
        if (i > 6 & i > 7 / 0) {  // i>6 false 不管是false 还是true 后面的语句都要执行 报异常
            System.out.println("111");
        }
        if (i > 3 && i > 7 / 0) {  //i>3 true  都为true 才为true 后面的要执行 报异常
            System.out.println("111");
        }
        if (i > 3 & i > 7 / 0) {
            System.out.println("111");
        }
        if (i > 6 || i > 7 / 0) { //都为false 才为false 执行后面的判断 报异常
            System.out.println("111");
        }
        if (i > 6 | i > 7 / 0) {
            System.out.println("111");
        }
        if (i > 3 || i > 7 / 0) {  //只要一个为true  就为true 就不执行后面的语句  就不报异常
            System.out.println("111");
        }
        if (i > 3 | i > 7 / 0) {
            System.out.println("111");
        }

    }

}


