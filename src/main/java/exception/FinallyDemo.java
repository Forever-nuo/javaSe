package exception;

import org.junit.Test;

/**
 * finally子句的使用
 * Created by Administrator on 2017/5/16.
 */
public class FinallyDemo {


    /***
     * finally一定会执行
     * 有finally 的方法中 可以有多个返回点
     * 最终的返回点 以finally中的return
     *
     * @return
     */
    public int functionFinally1() {
        try {
            try {
                System.out.println(111);
            } finally {

                return 444;
            }
        } finally {
            System.out.println(222);
            return 4;
        }
    }

    @Test
    public void testFinally1() {
        System.out.println(functionFinally1());
    }


    /**
     * break 语句和continue 语句
     * finally也会执行
     */
    @Test
    public void function2() {
        for (int x = 0; x < 100; x++) {
            try {
                if (x == 4) {
                    System.out.println(444);
                    break;
                }
            } finally {
                System.out.println(x);
            }
        }
    }


    @Test
    public void test1() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println(111);
        }
    }

    /**
     * 1.手动抛出异常
     * 2. catch 捕获到异常
     * 3. 执行代码1
     * 4. 手动抛出runtime 异常  交给虚拟机
     * 5. 执行finally 块中代码
     * 6.虚拟机抛出异常
     */
    @Test
    public void test2() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(2222);  //代码1
            throw new RuntimeException("新的runtime异常");
        } finally {
            System.out.println(111);
        }
    }


    /***
     * finally 结构
     * try {} finally{}
     */

    @Test
    public void test3() {
        try {
            System.out.println(111);
        } finally {
            System.out.println("try finally");
        }
    }

    /**
     * finally 结构2
     * try catch finally
     */
    @Test
    public void test4() {
        try {
            int  x =5/0;
        }catch (Exception e){
            System.out.println("不能为0");
        }finally {
            System.out.println("try catch finally");
        }
    }


    /***
     * finally不会执行的情况
     */
    @Test
    public void test() {
        try {

        }finally {
            System.out.println(3333);
        }

    }

}
