package ObjectToObject.duoTaiDemo;

import lombok.Data;

/**
 * Created by forever on 2017-5-2.
 */
@Data
public class Animal {
    int x = 3;

    void eat(){
        System.out.println("动物吃");
    }


    static  void  method(){
        System.out.println("父类方法");
    }
}
