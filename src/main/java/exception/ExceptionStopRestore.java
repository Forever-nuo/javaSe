package exception;

import org.junit.Test;

import java.util.Scanner;

/**
 * 异常的终止与恢复
 * Created by Administrator on 2017/5/16.
 */
public class ExceptionStopRestore {




    /**
     * 异常的终止1
     * 系统自动抛出异常
     * 交给虚拟机处理,出现异常代码处之后的代码不会执行
     */
    @Test
    public void testStop1() {
        System.out.println(11);
        int x = 5 / 0;
        System.out.println(333);
    }


    /***
     * 异常的终止2
     * try catch 块里 继续抛出异常
     * catch块后的代码不会执行
     */
    @Test
    public void testStop2() {
        try {
            System.out.println(11);
            int x = 5 / 0;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println(333);
    }


    /***
     * 异常的恢复
     * 1.catch 捕获处理异常
     * catch块里 不抛出新的异常
     * catch快里的异常会继续执行
     */
    @Test
    public void testRestore1() {
        try {
            System.out.println(11);
            int x = 5 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(33333);
    }


    /***
     * 使用while循环处理异常
     */

    public static void main(String[] args) {
        while(true){
            boolean flag = true;
            System.out.println("请输入数字");
            try{
                Scanner scanner = new Scanner(System.in);
                int i = scanner.nextInt();
            }catch (Exception e){
                flag =false;
                System.out.println("请输入正确的数字");
            }
            if(flag){
                break;
            }
        }

        System.out.println("输入完毕");

    }
}
