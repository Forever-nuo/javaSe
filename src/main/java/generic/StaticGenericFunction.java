package generic;

/**
 * 静态方法
 * 不能使用类上的泛型
 * 使用泛型 只能使用泛型方法
 * Created by forever on 2017-6-13.
 */
public class StaticGenericFunction<T> {
    /**
     * 静态方法使用泛型 不能沿用 类上的泛型
     * 只能使用方法上定义的泛型
     *
     * @param t
     * @param <M>
     */

    public static <M> void show(M t) {
        System.out.println(t);
    }
}
