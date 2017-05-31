package ObjectToObject.classDemo;

import org.junit.Test;

/**
 * 创建一个汽车
 * 汽车具有的属性
 * 颜色
 * 轮胎数
 * 汽车具有的行为
 * 运行
 * Created by forever on 2017-4-16.
 */
public class CarClassDemo {

    public static void main(String[] args) {
        Car car = new Car();
        String color = car.color;
        car.color="蓝色";
        System.out.println(car.color);//蓝色
        car.run();
    }

    /**
     * 匿名对象
     * 使用方式1
     */
    @Test
    public void test() {
        new Car().color="蓝色"; //调用属性 没有意义
        new Car().num = 5;
        new Car().run(); //只调用一次方法

        Car car = new Car();
        car.run();
    }

    public void show(Car car){
        car.color="黑色";
        car.num=3;
        car.run();
    }

    /**
     * 匿名函数  当做参数传递
     */
    @Test
    public void test6() {
        Car q = new Car();
        show(q);
        show(new Car());
    }

}
