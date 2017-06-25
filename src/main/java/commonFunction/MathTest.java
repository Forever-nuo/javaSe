package commonFunction;

import org.junit.Test;

import java.util.Random;

/**
 * Created by forever on 2017-6-20.
 */
public class MathTest {

    /***
     * 返回大于某个数的最小整数
     */
    @Test
    public void testCiel() {
        double ceil = Math.ceil(12.34);
        System.out.println(ceil);
        double ceil1 = Math.ceil(-12.34);
        System.out.println(ceil1);
    }


    /***
     * 小于的某个数的最大整数
     */
    @Test
    public void testFloor() {
        double floor = Math.floor(12.56);
        System.out.println(floor);
        double floor1 = Math.floor(-12.34);
        System.out.println(floor1);
    }

    /***
     * 四舍五入
     */
    @Test
    public void test() {
        long round1 = Math.round(12.46);
        long round2 = Math.round(12.56);
        long round3 =  Math.round(-12.46);
        long round4 =  Math.round(-12.56);
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);
        System.out.println(round4);
    }


    /**
     * 2的3次方
     *
     * 幂运算
     */
    @Test
    public void testPow() {

        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }

    /***
     * 随机数 0-1 之间的数
     * 包含0 不包含1
     */
    @Test
    public void testRandom() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }


    /**
     * 1-15之间的随机数
     */
    @Test
    public void testRandom1() {
        for (int i = 0; i < 50; i++) {
            System.out.println((int)(Math.random()*15+1));
        }
    }


    /***
     * 随机数 第二种方式
     */
    @Test
    public void testRandom2() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(10)+1);
        }
    }

}
