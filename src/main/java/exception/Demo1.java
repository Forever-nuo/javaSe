package exception;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Demo1 {

    public static void main(String[] args) {
        int score;
        while (true) {
            boolean isInt = true;
            Scanner console = new Scanner(System.in);
            try {
                score = console.nextInt();
            } catch (InputMismatchException e) {
                isInt = false;
                System.out.println("格式不正确,从新再输入：");
                main(new String[]{"2"});
            }
            if (isInt)
                break;
        }
     /*   try {
            System.out.println(111);
            throw new Exception("新的异常");
        }catch ( Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.fillInStackTrace();
        }finally {
            System.out.println("执行finally中的代码");
        }*/
    }


    @Test
    public void test1() {
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test2() {

        try {
            int[] arr = {1, 2};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }


    @Test
    public void test3() {
        try {
            System.out.println("开始抛出自定义异常");
            throw new MyException("我自定义的异常");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("自定义异常执行完成");
        }
    }


    public float chufa(int x, int y) {
        return (float) x / y;
    }


    @Test
    public void test4() {


    }

}
