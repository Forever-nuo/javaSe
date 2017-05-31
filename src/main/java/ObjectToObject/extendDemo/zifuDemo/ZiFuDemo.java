package ObjectToObject.extendDemo.zifuDemo;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.junit.Test;

/**
 * Created by forever on 2017-4-21.
 */
public class ZiFuDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.num1); //先访问子类对象  子类没有 就访问父类对象
        System.out.println(zi.num2);
        Fu fu = new Fu();
        System.out.println(fu.num1);
    }

    @Test
    public void test() {
        Zi zi = new Zi();
        Fu fu = new Zi(2);
    }

}
