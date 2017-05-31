package ObjectToObject.finalDemo.finalFunctionDemo;

/**
 * Created by forever on 2017-4-22.
 */
public class Person {

    /***
     * private 修饰的方法  隐式指定为 final
     * 在子类中可以出现同名的方法
     */
    private void show2(){
        System.out.println("private");
    }

    /***
     * final 修饰的方法  如果 权限修饰符不是private
     * 子类中不可以出现同父类一样的方法名
     */
   public final void show1(){
        System.out.println("show1");
    }

    protected  void show4(){
        System.out.println("show4");
    }

    /**
     * 可以写成 private  final  返回类型  方法名    但是没有多大意义 直接 写成private 返回类型 方法名
     * 在子类中可以出现同样的方法名
     * 子类中只是同名方法 但没有重写
     */
    private final void show3(){
        System.out.println("private final");
    }

}
