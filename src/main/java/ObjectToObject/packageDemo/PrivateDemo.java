package ObjectToObject.packageDemo;

import org.junit.Test;

/**
 * Created by forever on 2017-6-3.
 */
 class PrivateDemo {

    private  void privateFunction(){
        System.out.println("private 修饰的成员 只能在本类中使用");
    }


    @Test
    public void test() {
        privateFunction();
    }



}
