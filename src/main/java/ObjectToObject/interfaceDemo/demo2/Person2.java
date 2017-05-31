package ObjectToObject.interfaceDemo.demo2;

/**
 * 抽象类实现接口
 * 1.部分方法可以选择实现
 * 2.部分代码继续抽象
 * Created by forever on 2017-4-22.
 */
public abstract class Person2 implements Interface3 {
    public void show3() {
        System.out.println();
    }

    /**
     * 可以显示出来
     * 一般之间隐藏好了
     */
    public abstract void show4();
}
