package ObjectToObject.duoTaiDemo;

import lombok.Data;

/**
 * Created by forever on 2017-5-2.
 */
@Data
public class Cat extends  Animal {
    int x =4;
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    void catchMouse(){
        System.out.println("抓老鼠");
    }

    static void method(){
        System.out.println("子类方法");
    }
}
