package basisIntroduction.flowControl;

import org.junit.Test;

/**
 * Created by forever on 2017-4-12.
 */
public class WhileDemo {

    /**
     * while 循环
     * <p/>
     * 1.()括号中是boolean表达式
     * 如果为false 不执行代码块中的代码
     * 如果为true 执行代码块中的代码
     * 每次执行完代码块中的代码都会再次进入()中判断boolean表达式的值
     * 当为false的时候 就会结束循环
     * <p/>
     * 所以()中的表达式 要能发生变化 防止死循环(无限循环)
     */
    @Test
    public void test1() {
        int x = 4;
        while (x < 7) {   //while()中是boolean表达式  如果为true 执行代码块中代码 //如果为false 不执行代码块中的语句
            System.out.println(111);
            x++;
        }
    }

    /**
     * while do while
     */
    @Test
    public void test2() {
        int x = 4;
        while (x > 7) {
            System.out.println("先判断,当满足的时候,才会执行");
        }

        do {
            System.out.println("先执行一次,再进行判断!无论满不满足条件,至少执行一次");
        } while (x > 7);
    }

    /**
     * 死循环
     */
    @Test
    public void test3() {
        while (true) {
            System.out.println("死循环");
        }
    }

    /**
     * 控制死循环
     * 在循环中
     * 用if条件 break,return 控制循环
     */
    @Test
    public void test4() {
        int x = 2;
        while (true) {
            System.out.println(x);
            if (x == 5)
                break;
            x++;
        }
        System.out.println("跳出了死循环!");
    }
}
