package basisIntroduction.array;

import org.junit.Test;
import sun.java2d.pipe.SpanIterator;

/**
 * Created by forever on 2017-4-14.
 */
public class TypeInstruct {
    public static void show(int y){
        int x =3;
        System.out.println(y);
    }

    public static void main(String[] args) {
        int x [] = new int[3];
    }

    @Test
    public void test() {
        int a = 3;
        int b = a;
        a =6;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test2() {
        int a =3;
        int b =a;
        b=5;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test3() {
        int [] x={1,2,3};
        int [] y = x;
        y[1] = 6 ;
        int z = x[1];
        x =null;
    }

    @Test
    public void test4() {
        int x = 4;
        int y = x;
        x = 5 ;
        System.out.println(y);
        System.out.println(x);
    }

    @Test
    public void test5() {
        int[] x = {1,2,3,4};
        int[] y = x;
        x[1] =5;
        System.out.println(x[1]);
        System.out.println(y[1]);
    }
}
