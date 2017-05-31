package basisIntroduction.flowControl;

import org.junit.Test;

/**
 * Created by forever on 2017-4-12.
 */
public class BreakContinueDemo {

    /**
     * break的应用范围: switch语句 和 循环结构
     */
    @Test
    public void test() {
        int x = 3;
        switch (x) {
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(2);
                break;
        }

        for (; x > 5; ) {
            System.out.println(1);
            System.out.println(2);
            // break;  break之后定于语句没有意义
            x++;
            break;
        }
    }

    /**
     * break 和 continue区别
     */
    @Test
    public void test2() {
        for (int x = 3; x < 6; x++) {
            if (x == 4)
                break;
            System.out.println("break:" + x);
        }
        for (int x = 3; x < 6; x++) {
            if (x == 4)
                continue;
            System.out.println("continue:" + x);
        }
    }

    /**
     * break嵌套循环
     */
    @Test
    public void test3() {

        outer:
        for (int i = 0; i < 4; i++) {
            if (i == 2)
                break;
            for (int j = 0; j < 5; j++) {
                if (i + j == 8)
                    break outer;
            }
        }
    }

    /**
     * break标签
     */
    @Test
    public void test4() {
        outer:
        for (int i = 0; i < 4; i++) {
            if (i == 2)
                break;
            outer2:
            for (int x = 0; x <3; x++) {
                for (int j = 0; j < 5; j++) {
                    if (i + j == 8)
                        break outer2;
                }
            }
        }
    }

    /**
     * continue和break一样 也可以使用标签
     */
    @Test
    public void test5() {
        w:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3){
                    continue w;
                }
                System.out.println(11);
            }

        }
    }



}
