package ObjectToObject.innerClass;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 匿名内部类
 * 前提: 继承类 或者实现接口
 * Created by forever on 2017-5-11.
 */
public class NoNameInnerClass {


    class Inner1 extends A{
        public void showA(){
            System.out.println(111);
        }
    }


    public   void function(){
        A a = new Inner1();
        a.showA();
        new Inner1().showA();
        /***
         * 匿名内部类  new 已存在的父类或接口 () { 重写的方法..}; 创建了一个匿名内部类对象
         */
        A a1 =    new A(){
            @Override
            public void showA() {
                System.out.println(222);
            }
            void showB(){
                System.out.println("bbbb");
            }
        };
        /**'
         * 匿名内部类 new 已存在的类或接口(){重写的方法...}.方法();
         */
         new A(){
            @Override
            public void showA() {
                System.out.println(222);
            }
             void showB(){
                 System.out.println("bbbb");
             }
        }.showA();
        new A(){
            @Override
            public void showA() {
                System.out.println(222);
            }
            void showB(){
                System.out.println("bbbb");
            }
        }.showB();


        /***
         * 匿名子类对象 重写了多个方法
         * 可以用变量接受  然后分别调用不同的重写的方法
         */
        A a2 =    new A(){
            @Override
            public void showA() {
                System.out.println(222);
            }
            void showB(){
                System.out.println("bbbb");
            }
            @Override
            public void showC() {
                System.out.println(6666);
            }
        };
         a2.showA();
         a2.showC();

       // a1.showA();
    }
    public static void main(String[] args) {
        new NoNameInnerClass().function();
    }
}
