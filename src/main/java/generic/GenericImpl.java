package generic;

import org.junit.Test;

/**
 * Created by Forever丶诺 on 2017-10-25.
 */
public class GenericImpl {

    @Test
    public void test() {
        DemoA1 a1 = new DemoA1();
        //返回结果是继承时明确的类型
        String a1Result = a1.getObj();

        //子类重新定义泛型 实例化的时候 明确泛型 返回结果
        DemoA2<Integer, Integer> a2 = new DemoA2();
        String a2obj = a2.getObj();

        //实例化的时候没有 明确泛型 返回结果Object
        DemoA2 a22 = new DemoA2();
        Object a22Obj = a22.getObj();


        //实例化的时候没有 明确泛型 返回结果Object
        DemoA3<Integer, String> a3 = new DemoA3();
        Integer obj = a3.getObj();
    }
}


class DemoA<T> {
    T t;

    public T getObj() {
        return t;
    }
}


/**
 * 子类继承父类明确泛型
 */
class DemoA1 extends DemoA<String> {
}


/**
 * 子类继承父类明确泛型
 */
class DemoA2<A, E> extends DemoA<String> {
}

/**
 * 子类继承 重新定义泛型
 *
 * @param <T>
 * @param <E>
 */
class DemoA3<T, E> extends DemoA<T> {
}
