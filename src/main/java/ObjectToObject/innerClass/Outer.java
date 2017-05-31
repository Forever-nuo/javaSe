package ObjectToObject.innerClass;

/**
 * Created by forever on 2017-5-8.
 */
public class Outer {
    private int x = 1;

    private static int m = 3;

    /**
     * 内部类
     * 1.一个类定义在一个类的内部
     * 2.可以定义多个内部类
     * 3.内部类可以访问 外部类
     * 4.内部类可以被 protected 和 private 修饰
     */

    class Inner1 {
        private int x = 2;
        public void show2() {
            System.out.println(x);
        }
    }

    /**
     * 内部类的好处 可以直接访问外部类中的成员
     */
    class Inner2 {
        public void show2() {
            System.out.println(x);
        }
    }

    /**
     * 多层嵌套内部类
     */
    static class Inner3 {
        int x = 3;

        public void show2() {
            System.out.println(x);
        }

        class InnerInner {
            int x = 3;

            public void function1() {
                System.out.println(1111);
            }
        }
    }

    /**
     * 外部类中 访问 内部类
     */
    public void outShow() {

        Inner1 inner1 = new Inner1();   //直接内部类类名
        inner1.show2();
    }

    /**
     * 内部类 直接访问外部类的原因
     */
    class Inner4 {
        int x = 5;

        public void function1() {
            int x = 6;
            System.out.println(x);
        }

        public void function2() {
            System.out.println(this.x);
        }

        public void function3() {
            System.out.println(Outer.this.x);
        }

    }

    /**
     * 主方法中访问内部类
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         *  在主方法中  外部的类型 是 外部类类型.内部类类型 可以省略成 内部类类型
         *  */
        Inner1 inner3 = new Outer().new Inner1();

        //方式1 :  外部类.内部类  内部类引用 = new 外部类().new 内部类();
        Outer.Inner1 inner1 = new Outer().new Inner1();   //这种方式其实就是匿名对象!
        inner1.show2();

        //方式2 :   先创建一个 外部类对象  再 外部类引用.new 内部类();
        Outer out = new Outer();
        Inner2 inner2 = out.new Inner2();
        inner2.show2();

        //创建静态内部类
        StaticInner staticInner = new Outer.StaticInner();
        System.out.println(staticInner.y);
    }

    /***
     * 静态内部类
     */

    static class StaticInner {
        int y = 3;

        public void show1() {
            System.out.println(m);
        }

        /***
         * 静态内部类的 成员也是静态的
         * 访问静态成员不需要创建对象
         */
        public static void show2() {
            System.out.println(111);
        }
    }

    /**
     * 内部类 中的成员是静态的那么 内部类也必须是静态的
     */
/*    class Inner6{
        public static void show(){
            System.out.println(11);
        }
    }*/
    static class Inner7 {
        public void show() {
            System.out.println(11);
        }
    }

    /***
     * 外部类的静态成员访问内部类时
     * 内部类也必须是静态的
     */
    public static void show3() {
        new Inner7().show();
    }

    /**********
     * 局部内部类
     * 定义在方法之中
     */

    void function1() {
        final int x = 3;
        /**
         * public 修饰成员
         * 局部内部类 不可以被public 修饰
         *
         * static 修饰成员
         * 局部内部类 不可以被static 修饰
         *
         * 局部内部类中的成员也不可以被 static 修饰
         *  内部类的成员被static 修饰 那么内部类 也要被static 修饰  冲突 局部内部类不能被static 修饰冲突
         */
        class Inner9 {
            void function2(final int y) {
                /**
                 * 局部内部类只能访问被final修饰的局部变量
                 */
                System.out.println("局部内部类" + x +y);
            }
        }

        /**
         * 内部类 创建内部类对象才会调用类中成员
         */
        new Inner9().function2(4);
    }

}
