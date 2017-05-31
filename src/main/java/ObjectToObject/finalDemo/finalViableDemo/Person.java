package ObjectToObject.finalDemo.finalViableDemo;

/**
 * Created by forever on 2017-4-22.
 */
public class Person {
    final  int x;  //final修饰的变量 可以先声明 再赋值
    final int y = 4;

   final int[] name = new int[]{1,5,4,6};
    static final String PERSON_NAME="aadaw "; //final static 修饰的基本数据类型 表示常量 一定先赋值

    {
        name[2]=4;  //final 修饰 引用数据类型   表示 引用的地址不可以改变 但是所引用的对象本身可以改变
        x = 3;  //final修饰的基本数据类型变量 表示常量 只能赋值一次不可以再发生变化(默认初始化 不算一次赋值)
       //PERSON_NAME = "sdwe";
        //  PERSON_NAME = "112";
    }

    public void funtion1(final int m) {
        //  m = 3;  //final 修饰的参数 在方法内部 不能再改变所指对象
        final int a;
        a = 5;
        //   a = 5;
    }
}
