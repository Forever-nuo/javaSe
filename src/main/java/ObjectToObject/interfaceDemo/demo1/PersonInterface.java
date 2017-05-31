package ObjectToObject.interfaceDemo.demo1;

/**
 * 定义接口  将class 改成interface 关键字
 * 接口也有权限修饰符
 * Created by forever on 2017-4-22.
 */
public interface PersonInterface {
    /**
     * 接口中的成员变量
     * 默认是 public static final  数据类型 变量名
     * 可以简写成 数据类型 变量名   但还是 public static final
     * 哪怕写成 public static 数据类型 还是public static final 数据类型 变量名
     */
    public static final String Country = "中国";
    public static  String Country1= "中国";
    String NAME = "张三";


    /***
     * 接口中所有的方法都是抽象的 没有方法体
     * 默认都是 public abstract 返回类型 方法名(参数列表) ;
     */

    public  abstract  void show1(int i);

    /**
     * 可以简写成 返回类型 方法名(参数列表);
     * 但还是 是 public abstract 返回类型 方法名(参数列表);
     */
    void show2();


    /***
     * 接口中 不可以有代码块
     */
 /*   {
        System.out.println();
    }*/

}
