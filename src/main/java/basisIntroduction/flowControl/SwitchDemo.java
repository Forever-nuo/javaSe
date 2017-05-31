package basisIntroduction.flowControl;

import org.junit.Test;

/**
 * switch语句
 * Created by forever on 2017-4-11.
 */
public class SwitchDemo {

    /**
     * switch 和if 的比较
     * switch 能解决的 if都可以解决
     * 什么时候用 if
     * 当进行判断的数值 不多的情况下 用switch  case的数值都会加载进内存中
     *
     * 用boolean 型 和 区间的情况下 用if比较方便
     */

    /***
     * case和default没有顺序
     */

    @Test
    public void test() {
        int x = 3, y = 5;
        switch (x + y) { //switch(整数表达式,char表达式 表达式最后有一个值整数类型或char类型)
            case 5:          //拿switch()中的表达式 和 case后面的值匹配 如果满足就执行 后面的复合语句 遇到break 就跳出代码块
            case 2:
                System.out.println(3333);
                System.out.println(3333);
            case 9:
                System.out.println(555);
                System.out.println(555);
                System.out.println(555);
                break;
            default:   //default 顺序是随意的
        }
    }

    @Test
    public void test1() {
        int x = 3, y = 5;
        switch (x + y) {
            default:                           //先判断所有的case值 //如果都不满足 就会执行default之后的语句
                System.out.println(11);
            case 1:
                System.out.println(122);
                System.out.println(122);
            case 3:
                System.out.println(333);
                break;
            case 4:
                System.out.println(5555);
        }
    }

    /**
     * default 和 case 之间的顺序是随意的
     * 但是程序执行的 判断
     * 先判断所有的case
     * 当都不满足
     * 才会执行default之后的语句
     */
    @Test
    public void test2() {
        int x = 3, y = 5;
        switch (x + y) {
            case 1:
                System.out.println(122);
                System.out.println(122);
            default:                           //先判断所有的case值 //如果都不满足 就会执行default之后的语句
                System.out.println(11);
            case 3:
                System.out.println(333);
                break;
            case 4:
                System.out.println(5555);
        }
    }

    /**
     * 根据月份得到季节
     * @param month
     * @return
     */
    public String getSeasonByMonth(int month) {
        String str;
        switch (month) {
            case 3:
            case 4:
            case 5:
                str = "春天";
                break;
            case 6:
            case 7:
            case 8:
                str = "夏天";
                break;
            case 9:
            case 10:
            case 11:
                str = "秋天";
                break;
            case 12:
            case 1:
            case 2:
                str = "冬天";
                break;
            default:
                str = "不存在的月份";
        }
        return str;
    }

    @Test
    public void test5() {
        System.out.println(getSeasonByMonth(7));
    }

}
