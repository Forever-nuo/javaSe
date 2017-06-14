package generic;

import org.junit.Test;

/**
 * 泛型类
 * Created by forever on 2017-6-13.
 */

public class GenericClass {

    /***
     * 泛型前 强转 运行时期会出现隐患
     */
    @Test
    public void testObjectClass() {
        Tool tool = new Tool();
        tool.setObject(new Worker());
        Student student = (Student) tool.getObject();
    }

    /**
     * 使用泛型
     */
    @Test
    public void testGenericCLass() {
        Utils<Student> utils = new Utils<>();
        utils.setObject(new Student());

        // utils.setObject(new Worker());编译时会报错
    }

}


class Student {
}

class Worker {
}

/**
 * 泛型前
 */
class Tool {
    private Object object;

    void setObject(Object object) {
        this.object = object;
    }

    Object getObject() {
        return this.object;
    }
}


/***
 * 泛型类  在类<定义泛型>
 * 参数,成员变量,返回值都可以使用泛型
 *
 * @param <T>
 */
class Utils<T> {
    private T t;

    void setObject(T t) {
        this.t = t;
    }

    T getObject() {
        return t;
    }
}

