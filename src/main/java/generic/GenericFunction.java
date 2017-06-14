package generic;

import org.junit.Test;

/**
 * 泛型方法可以不再类上定义泛型  (不沿用类上的泛型)
 * 只在方法上定义类型
 *
 * 泛型方法 也可以延用类上的泛型
 * 泛型类创建 泛型明确 方法也跟着明确 那就沿用类上的泛型
 * Created by forever on 2017-6-13.
 */
public class GenericFunction<M> {

    public <G> void show(G g) {
        System.out.println(g);
    }

    public  <T>T getObject(T t){
        return t;
    }

    @Test
    public void testShow() {
        show(666);
    }
}

class A extends  GenericFunction<String>{
    @Override
    public <String> void show(String g) {
        super.show(g);
    }
}
