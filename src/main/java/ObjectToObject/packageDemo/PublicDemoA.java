package ObjectToObject.packageDemo;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import org.junit.Test;

/**
 * Created by forever on 2017-6-3.
 */
public class PublicDemoA {

    @Test
    public void test() {
        DefaultDemo2 demo2 = new DefaultDemo2();
        demo2.function();
    }


   public void publicFunction(){
        System.out.println("1111");
    }

    void defaultFunction(){
        System.out.println("defaultFunction");
    }

    protected  void protectedFunction(){
        System.out.println("protectedFunction");
    }

    private void privateFunction(){
        System.out.println("privateFunction");
    }
}
