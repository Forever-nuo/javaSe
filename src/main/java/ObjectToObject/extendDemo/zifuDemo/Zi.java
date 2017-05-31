package ObjectToObject.extendDemo.zifuDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-4-21.
 */
public class Zi extends Fu {
    int num1 = 9;

    /**
     * 出现同名变量 在子类中  如果想访问父类的成员 可以使用super关键字
     */
    @Test
    public void showTest() {
        System.out.println(num1);
        System.out.println(super.num1);
    }

  @Override
    public void show() {
        System.out.println("1111");
    }

    @Test
    public void testShowFunction() {
        show();
        super.show();
    }

    public void show1(){

    }


      void show2(){
         System.out.println(111);
     }

    public Zi() {

        System.out.println("子类的构造函数");
    }

    public Zi(int num1) {
        System.out.println("子类的构造函数2");
        this.num1 = num1;
    }
}
