package basisIntroduction.function;

/**
 * 方法的重载
 * 1.同一个类中
 * 1.只跟参数列表有关系
 * 2.和返回值无关
 * Created by forever on 2017-4-13.
 */
public class FunctionOverload {

    /**
     * 2个整数的和
     *
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * 3个整数的和
     *
     * @param x
     * @param y
     * @param z
     * @return
     */
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    /**
     * 2个小数的和
     *
     * @param x
     * @param y
     * @return
     */
    public double add(double x, double y) {
        return x + y;
    }

}
