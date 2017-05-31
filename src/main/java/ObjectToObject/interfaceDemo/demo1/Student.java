package ObjectToObject.interfaceDemo.demo1;

/**
 * Created by forever on 2017-4-22.
 */
public class Student implements PersonInterface {
    /***
     * 接口中所有的方法都是抽象的 没有方法体
     * 默认都是 public abstract 返回类型 方法名(参数列表) ;
     *
     * @param i
     */
    public void show1(int i) {

    }

    /**
     * 可以简写成 返回类型 方法名(参数列表);
     * 但还是 是 public abstract 返回类型 方法名(参数列表);
     */
    public void show2() {

    }
}
