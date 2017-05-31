package basisIntroduction.function;

import org.junit.Test;

/**
 * 什么是函数
 * 1.定义在类中(类中的成员,类有属性:成员变量 类有行为:函数,方法)
 * 2.具有特定功能的小程序
 * 3.函数也叫方法
 * Created by forever on 2017-4-13.
 */
public class FunctionDemo {
    /***
     * 形参
     * int x  ,int y 就是 function1方法的  形参 相当于一个变量 用来接收实参
     */
    public int function1(int x, int y) {
        return x + y;
    }

    /**
     * 函数没有返回值类型  就用void关键字
     * 有返回值类型的函数 一定要有return 值 ;
     * void 函数 ,return 在最有一行 可以省略不写
     */
    public void function2() {
        /***
         * 实参: 3,4 就是 function1函数(方法) 的实际参数值
         *
         * 函数的调用 function1在Function2中被调用
         *
         * 有返回值的函数可以 用变量来接受
         *
         *
         * 多个函数在类中  定义可以是无序的 不受影响
         */
        int x = function1(3, 4);
    }

    /**
     * 函数的调用
     * <p/>
     * 对象.函数名(实参1,实参2,...);
     * 静态函数
     * 类.函数名(实参1,实参2,...);
     * <p/>
     * 在同一个类中调用
     * 直接:函数名(实参1,实参2,...)
     * <p/>
     * 静态导入
     * 也可以省略类.
     */

    public void test() {
        function1(3, 4);
        String.valueOf(1);
    }

    /**
     * void关键字  function功能没有具体的返回值 使用关键字void
     */
    public void test2() {
        System.out.println(11);
        System.out.println(11);
        return;
    }

    /**
     * 这只是一个静态函数  不是主函数
     *
     * @param args
     * @param args1
     */
    public static void main(String[] args, String[] args1) {
        System.out.println(111);
    }

    /**
     * 主函数:
     * 1.只能是 public static void main()
     * 2.参数列表只能是 String [] args
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(222);
        main(new String[]{"1", "2"}, new String[]{"1", "2"});
    }

    /**
     * static 修饰的函数就是静态函数
     */
    public static void staticFunction1() {
        System.out.println(11);
    }

    /**
     * 静态函数中只能访问静态成员(静态函数)
     */
    public static void staticFunction2() {
        staticFunction1();
    }

    /**
     * 参数列表
     * 1.参数的个数
     * 2.参数的类型
     * 3.顺序不同
     * 例如重载函数 function1(int x ,double y) function1(double x ,int y) 也是重载
     *
     * @param x
     * @param y
     */
    public void paramFunction1(double x, int y) {
        System.out.println(x + y);
    }

    public void paramFunction1(int x,double y){
        System.out.println(x+y);
    }

    public int returnFunction(int x, int y) {
        return x + y;
    }

    @Test
    public void testReturnFunction() {
        int x = returnFunction(3, 5);    //有返回值的函数 可以用变量接受
        System.out.println(returnFunction(4, 5)); //可以作为别的函数的参数
    }

}
