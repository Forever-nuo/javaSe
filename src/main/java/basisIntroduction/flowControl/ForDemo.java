package basisIntroduction.flowControl;

import org.junit.Test;

/**
 * Created by forever on 2017-4-12.
 */
public class ForDemo {

    /**
     * for循环
     * <p/>
     * for(初始化表达式;boolean表达式;每次循环后执行的表达式)
     * <p/>
     * 初始化表达式 和 每次循环的表达式
     * 可以有0条和多条 多条之间以,号隔开
     */
    @Test
    public void test() {
        for (int x = 4, y = 5; x + y < 100; System.out.println("没有大于100执行的语句"), x++, y++) {
            System.out.println("x+y还没有大于100!");
        }
        System.out.println("终于大于100了");
    }

    /**
     * for的死循环
     */
    @Test
    public void test1() {
        int x = 100;
        for (; ; x++) {
            System.out.println("还没跳出死循环");
            if (x > 120)
                break;
        }
        System.out.println("终于跳出死循环了");
    }

    /**
     * for和while的区别
     */
    @Test
    public void test2() {
        for (int x = 4; x < 8; x++) {   //x的作用域 在 for的( - }之间
            System.out.println(x);
        }
        // System.out.println(x);

        int y = 4;
        while (y < 8) {
            System.out.println(y);
            y++;
        }
        System.out.println(y);
    }

    @Test
    public void test3() {
        int x = 4;
        for (; x < 8; x++) {
            System.out.println();
        }
        System.out.println(x);
    }

    @Test
    public void test4() {
        for (System.out.println(1); ; System.out.println(3)) {
            System.out.println(4);
        }
    }

    /**
     * for循环的嵌套
     */
    @Test
    public void test5() {
        for(int x = 0;x<4;x++){
            for(int y=0;y<3;y++){
                System.out.println("x="+x+",y="+y);
            }
        }
    }

    /**
     *
     *   *****
     *   ****
     *   ***
     *   **
     *   *
     *
     */
    @Test
    public void test6() {
        for(int x=0;x<5;x++){    //外循环控制打印的行数
            for(int y=0;y<5-x;y++){
                System.out.print("*"); //内循环控制每行 打印的个数
            }
            System.out.println();
        }
    }

    /**
     * 九九乘法表
     */
    @Test
    public void test7() {
        for(int x=1;x<=9;x++){    //外循环控制打印的行数
            for(int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+x*y+"\t"); //内循环控制每行 打印的个数
            }
            System.out.println();
        }
    }




}
