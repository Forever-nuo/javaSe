package ObjectToObject.innerClass;

/**
 * Created by forever on 2017-5-8.
 */
public class OtherOuter {

    void show() {
        //方式1
        Outer.Inner1 inner1 = new Outer().new Inner1();
        inner1.show2();

        //方式2
        Outer outer = new Outer();
        Outer.Inner1 inner11 = outer.new Inner1();
    }
}
