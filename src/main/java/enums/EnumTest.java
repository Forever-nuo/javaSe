package enums;

import org.junit.Test;
import sun.security.util.AuthResources_it;

import java.util.EnumSet;
import java.util.Iterator;

import static enums.Color.GREEN;
import static enums.Color.RED;
import static enums.Color.YELLOW;

/**
 * @author Forever丶诺
 * @date 2018/4/3 15:47
 */
public class EnumTest {

    @Test
    public void test1() {
        //BlUE
        System.out.println(Color.RED);
        //枚举类对应的所有制
        Color[] values = Color.values();
    }

    /***
     * 使用在switch 语句中
     */
    @Test
    public void test2() {
        Color color = Color.RED;
        switch (color) {
            case RED:
                color = YELLOW;
                break;
            case YELLOW:
                color = GREEN;
                break;
            case GREEN:
                color = RED;
        }
        System.out.println(color);
    }

    @Test
    public void test3() {

        System.out.println(Color1.RED.getDesc());
        System.out.println(Color1.BLUE.getDesc());

        //其他方法
        Color1.RED.otherFun();

        //静态方法
        Color1.staticFun();

        //覆盖的方法
        System.out.println(Color1.RED.toString());
    }

    /**
     * 使用接口组织枚举
     */
    @Test
    public void test4() {

        //使用接口组织多个枚举
        Food.Office blackCoffee = Food.Office.BLACK_COFFEE;

        //使用多态
        Food food = Food.Office.BLACK_COFFEE;


    }

    /**
     * 枚举的EnumSet 和 EnumMap
     */
    @Test
    public void test5() {
        EnumSet<Color> colorSet = EnumSet.of(Color.RED, Color.GREEN);
        Iterator<Color> iterator = colorSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
