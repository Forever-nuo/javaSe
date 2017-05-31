package exception;

/**
 * Created by Administrator on 2017/5/16.
 */
public class RuntimeExceptionDemo {


    /**
     * 手动抛出的runtimeException异常
     * 1.不会受编译器检测
     * (1).不需要throws 异常声明 或 (2).不需要再进行try catch 捕获
     */
    public static void function1(){
            throw  new RuntimeException();
    }


    public static void function2(){
        function1();
    }


    public static void main(String[] args){
        function2();
    }
}
