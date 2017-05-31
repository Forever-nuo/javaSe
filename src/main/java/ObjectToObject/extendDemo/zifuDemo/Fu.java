package ObjectToObject.extendDemo.zifuDemo;

/**
 * Created by forever on 2017-4-21.
 */
public class Fu {
    int num1 = 4, num2 = 5;

    public Fu() {
        System.out.println("无参的父类构造函数");
    }

    public Fu(int num1) {
        this.num1 = num1;
    }

    public void show() {
        System.out.println("父类show方法");
    }

    /***
     * 父类private 修饰的方法不能被子类覆盖
     */
    private void show1(){
        System.out.println("父类 private 修饰的方法");
    }

    private void  show2(){
        System.out.println("11");
    }
}
