package String;

import org.junit.Test;

/**
 * Created by forever on 2017-6-6.
 */
public class StringDemo1 {
    public static void main(String[] args) {
         // str 是引用数据类型变量  "2233" 是一个对象 字符串 一旦创建就不能改变
        String str1 = new String("2233");
        String str = "2233";
        String str2 = "2233";  //
        System.out.println(str==str1); //false
        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str2));//true
        System.out.println(str==str2);//true
    }


    /****
     * String str1 = new String("2233");
     * 和
     *  String str = "2233"; 的区别
     *
     *  1. String str1 = new String("2233"); 在内存中有2个对象
     *  2. String str = "2233";  只有1个对象
     */
    @Test
    public void test1() {
        String str1 = new String("2233");
        String str = "2233";
        String str2 = "2233";  //
        System.out.println(str==str1); //false
        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str2));//true
        System.out.println(str==str2);//true
    }

    @Test
    public void test2() {
        String str = "2233";
        String str1 = new String("2233");
        String str2 = "2233";  //
        System.out.println(str==str1); //false
        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str2));//true
        System.out.println(str==str2);//true
    }

    /**
     * 字符串常量池
     *
     * 为什么str 和str2   str==str2 为true  ?
     *
     * String str = "2233";
     * 创建"2233"对象后
     * 会放到常量池中
     * String str2 = "2233"
     * 先到常量池中寻找 如果之间创建过 就可以寻找到
     *
     * 所以是同一个对象
     */
    @Test
    public void test3() {
        String str = "2233";
        String str2 = "2233";  //
        System.out.println(str.equals(str2));//true
        System.out.println(str==str2);//true
    }

    /***
     * 创建字符串
     */
    @Test
    public void testCreateString() {
        /**
         * 方法1  String 变量 = "字符串内容";
         */
        String str = "abc";
        /**
         * 方法2 String 类的构造函数
         */
        String str1 = new String("abc");
        String str2 = new String("abc".toCharArray());
    }


    @Test
    public void test() {
        String str = "3323";
        str.toCharArray();
    }
}
